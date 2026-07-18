import subprocess
from datetime import datetime


def run(command, check=True):
    return subprocess.run(command, shell=True, check=check, text=True, capture_output=True)


def has_changes():
    return run("git status --porcelain").stdout.strip() != ""


stashed = False
if has_changes():
    run('git stash push -u -m "auto-stash-before-sync"')
    stashed = True

# 1. Sync with remote before making changes
run("git fetch origin")
run("git pull --rebase origin main")

# 2. Restore local changes after sync
if stashed:
    run("git stash pop")

# 3. Modify the file
with open("log.txt", "a") as f:
    f.write(f"Update on {datetime.now()}\n")

# 4. Git add
run("git add .")

# 5. Git commit
run('git commit -m "Daily update"')

# 6. Git push
run("git push origin main")
