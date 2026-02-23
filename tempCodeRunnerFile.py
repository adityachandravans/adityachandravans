import subprocess
from datetime import datetime

def run(command):
    subprocess.run(command, shell=True, check=True)

# 1. Modify the file
with open("log.txt", "a") as f:
    f.write(f"Update on {datetime.now()}\n")

# 2. Git add
run("git add .")

# 3. Git commit
run('git commit -m "Daily update"')

# 4. Git push
run("git push origin main")
