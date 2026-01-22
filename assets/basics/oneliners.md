# One-liners

## Run the previous command with sudo
```[sudo](/man/sudo) !!```

## Spin up a local HTTP server
```[python3](/man/python3) -m http.server 8000```

## Play ASCII Star Wars
```[telnet](/man/telnet) towel.blinkenlights.nl```

## Play a video in terminal
```[mplayer](/man/mplayer) -vo caca video.mp4```

## Display system information beautifully
```[screenfetch](/man/screenfetch) or [neofetch](/man/neofetch)```

## Display fortune and cow
```[fortune](/man/fortune) | [cowsay](/man/cowsay)```

## Simulate slow typing
```echo "text" | [pv](/man/pv) -qL 10```

## Matrix digital rain
```[cmatrix](/man/cmatrix)```

## Create 100 numbered directories
```[mkdir](/man/mkdir) project{01..100}```

## Change to the previous directory
```[cd](/man/cd) -```

## Quickly backup a file
```[cp](/man/cp) file{,.bak}```

## Fix typo in the previous command
```^wrong^correct^```

## Get your public IP address
```[curl](/man/curl) ifconfig.me```

## Repeat the last command
```!!```

## Edit current command line in your editor
```Ctrl+X Ctrl+E```

## Pretty-print JSON from stdin
```[jq](/man/jq) .```

## Find largest files/directories in current directory
```[du](/man/du) -h . | [sort](/man/sort) -hr | head -20```

## Show disk usage in human-readable format
```[df](/man/df) -h```

## Show directory sizes sorted
```[du](/man/du) -sh * | [sort](/man/sort) -hr```

## Create a tar.gz backup
```[tar](/man/tar) czf backup.tar.gz directory/```

## Extract a tar.gz archive
```[tar](/man/tar) xzf archive.tar.gz```

## Watch command output refresh every 2 seconds
```[watch](/man/watch) command```

## Kill process by name
```[pkill](/man/pkill) process_name```

## View processes sorted by CPU
```[top](/man/top)```

## List open network ports
```[ss](/man/ss) -tuln```

## Generate random password
```< /dev/urandom [tr](/man/tr) -dc A-Za-z0-9 | head -c 32; echo```

## Search command history interactively
```Ctrl+R```

## Count lines in a file
```[wc](/man/wc) -l file.txt```

## Remove duplicate lines
```[sort](/man/sort) file | [uniq](/man/uniq)```

## Find files by name
```[find](/man/find) . -name "*.log"```

## Find files larger than 100MB
```[find](/man/find) . -type f -size +100M```

## Copy with progress bar
```[rsync](/man/rsync) -ah --progress src dest```

## Download file with resume
```[wget](/man/wget) -c url```

## Mount remote directory over SSH
```[sshfs](/man/sshfs) user@host:/remote /local```

## Check if command exists
```command -v cmd >/dev/null && echo yes```

## List files by modification time
```[ls](/man/ls) -lt```

## Grep recursively ignoring case
```[grep](/man/grep) -ir "text" .```

## Empty/truncate a file
```> file.txt```

## Create directory and cd into it
```[mkdir](/man/mkdir) dir && [cd](/man/cd) dir```

## Compress with bzip2
```[tar](/man/tar) cjf archive.tar.bz2 dir/```

## Show weather in terminal
```[curl](/man/curl) wttr.in```

## Get full weather report
```[curl](/man/curl) v2.wttr.in```

## Pretty-print XML
```[xmllint](/man/xmllint) --format file.xml```

## Convert image to different format
```[convert](/man/convert) input.jpg output.png```

## Create animated GIF from images
```[convert](/man/convert) -delay 10 -loop 0 *.png animation.gif```

## Run the train animation
```[sl](/man/sl)```

## Display system info with ASCII art
```[neofetch](/man/neofetch)```

## Monitor file changes
```[tail](/man/tail) -f logfile```

## Search and replace in files
```[sed](/man/sed) -i 's/old/new/g' *.txt```

## Show only directories
```[ls](/man/ls) -d */```

## Tree view of directory
```[tree](/man/tree)```

## Pipe output to clipboard
```command | [xclip](/man/xclip) -sel clip```

## Create symlink
```[ln](/man/ln) -s target link```

## Show current git branch
```[git](/man/git) branch --show-current```

## Delete files older than 30 days
```[find](/man/find) . -mtime +30 -delete```

## Find and delete empty directories
```[find](/man/find) . -type d -empty -delete```

## Show calendar
```[cal](/man/cal)```

## Show colorful calendar
```[cal](/man/cal) -3```

## Generate QR code
```[qrencode](/man/qrencode) -t ANSI "text"```

## Record terminal session
```[script](/man/script) session.log```

## Replay terminal session
```[scriptreplay](/man/scriptreplay) -t timing.log session.log```

## Check battery percentage
```[upower](/man/upower) -i $(upower -e | grep BAT) | grep percentage```

## Monitor CPU temperature
```[sensors](/man/sensors)```

## List cron jobs
```[crontab](/man/crontab) -l```

## Encrypt file with gpg
```[gpg](/man/gpg) -c file```

## Create RAM disk
```[mount](/man/mount) -t tmpfs -o size=1G tmpfs /mnt/ram```

## Run command in background
```command &```

## Run detached from terminal
```[nohup](/man/nohup) command &```

## Split large file
```[split](/man/split) -b 1G largefile part-```

## Reassemble split files
```[cat](/man/cat) part-* > largefile```

## Check file checksum
```[sha256sum](/man/sha256sum) file```

## Download YouTube video
```[yt-dlp](/man/yt-dlp) url```

## Play YouTube video in terminal
```[mpv](/man/mpv) url```

## Show file with line numbers
```[nl](/man/nl) file.txt```

## Convert DOS to Unix line endings
```[dos2unix](/man/dos2unix) file```

## Reload shell configuration
```source ~/.bashrc```

## Check system uptime
```[uptime](/man/uptime)```

## Progress bar for any command
```command | [pv](/man/pv) -s $(du -b input | cut -f1)```

## View PDF in terminal
```[pdftotext](/man/pdftotext) file.pdf - | [less](/man/less)```

## Burn ISO to USB
```[dd](/man/dd) if=iso.iso of=/dev/sdX bs=4M status=progress```

## Securely wipe drive
```[dd](/man/dd) if=/dev/urandom of=/dev/sdX```

## List hardware info
```[lshw](/man/lshw) -short```

## Disk speed test
```[dd](/man/dd) if=/dev/zero of=test bs=1G count=1 oflag=dsync```

## Play beep
```echo -e "\a"```

## Show current timezone
```[timedatectl](/man/timedatectl)```

## Fireworks animation
```for i in {1..50}; do echo -e "\e[${((RANDOM%7+31))}m✨\e[0m"; sleep 0.1; done```

## Rainbow text
```echo "text" | [lolcat](/man/lolcat)```

## Display clock in terminal
```[watch](/man/watch) -n 1 date```

## Count files in directory
```[ls](/man/ls) | [wc](/man/wc) -l```

## Find broken symlinks
```[find](/man/find) . -type l -! -exec test -e {} \; -print```

## Quick HTTP server in Ruby
```[ruby](/man/ruby) -run -e httpd . -p 8000```

## Quick HTTP server in PHP
```[php](/man/php) -S localhost:8000```

## Quick HTTP server in Node.js
```[npx](/man/npx) http-server```

## Alias to repeat last command
```alias r='fc -s'```

## Show most used commands
```history | awk '{print $2}' | sort | uniq -c | sort -nr | head```

## Extract any archive
```a() { case $1 in *.tar.gz) tar xzf $1;; *.zip) unzip $1;; esac; }; a file```

## Create sparse 10GB file
```[truncate](/man/truncate) -s 10G file.img```

## Merge multiple PDFs
```[gs](/man/gs) -dBATCH -dNOPAUSE -sDEVICE=pdfwrite -sOutputFile=out.pdf in1.pdf in2.pdf```

## Convert video to GIF
```[ffmpeg](/man/ffmpeg) -i input.mp4 output.gif```

## Batch rename files
```for f in *.txt; do mv "$f" "${f%.txt}.bak"; done```

## Show git status nicely
```[git](/man/git) status -sb```

## One-liner web server in bash
```while true; do echo -e "HTTP/1.1 200 OK\n\n$(date)" | nc -l 8080; done```