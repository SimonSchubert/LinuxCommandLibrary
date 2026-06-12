# One-liners

## Run the previous command with sudo
```[sudo](/man/sudo) !!```

## Repeat the last command
```!!```

## Fix typo in the previous command
```^wrong^correct^```

## Search command history interactively
```Ctrl+R```

## Edit current command line in your editor
```Ctrl+X Ctrl+E```

## Alias to repeat last command
```alias r='fc -s'```

## Show most used commands
```history | awk '{print $2}' | sort | uniq -c | sort -nr | head```

## Reload shell configuration
```source ~/.bashrc```

## Check if command exists
```command -v cmd >/dev/null && echo yes```

## Change to the previous directory
```[cd](/man/cd) -```

## Create directory and cd into it
```[mkdir](/man/mkdir) dir && [cd](/man/cd) dir```

## Create 100 numbered directories
```[mkdir](/man/mkdir) project{01..100}```

## Quickly backup a file
```[cp](/man/cp) file{,.bak}```

## Empty/truncate a file
```> file.txt```

## Batch rename files
```for f in *.txt; do mv "$f" "${f%.txt}.bak"; done```

## Create symlink
```[ln](/man/ln) -s target link```

## Show only directories
```[ls](/man/ls) -d */```

## List files by modification time
```[ls](/man/ls) -lt```

## Count files in directory
```[ls](/man/ls) | [wc](/man/wc) -l```

## Tree view of directory
```[tree](/man/tree)```

## Show file with line numbers
```[nl](/man/nl) file.txt```

## Count lines in a file
```[wc](/man/wc) -l file.txt```

## Remove duplicate lines
```[sort](/man/sort) file | [uniq](/man/uniq)```

## Search and replace in files
```[sed](/man/sed) -i 's/old/new/g' *.txt```

## Grep recursively ignoring case
```[grep](/man/grep) -ir "text" .```

## Find files by name
```[find](/man/find) . -iname "*.log"```

## Find files larger than 100MB
```[find](/man/find) . -type f -size +100M```

## Delete files older than 30 days
```[find](/man/find) . -mtime +30 -delete```

## Find and delete empty directories
```[find](/man/find) . -type d -empty -delete```

## Find broken symlinks
```[find](/man/find) . -xtype l```

## Find largest files and directories
```[du](/man/du) -ah . | [sort](/man/sort) -hr | [head](/man/head) -20```

## Show directory sizes sorted
```[du](/man/du) -sh * | [sort](/man/sort) -hr```

## Show disk usage in human-readable format
```[df](/man/df) -h```

## Monitor file changes
```[tail](/man/tail) -f logfile```

## Watch command output refresh every 2 seconds
```[watch](/man/watch) command```

## Display clock in terminal
```[watch](/man/watch) -n 1 date```

## Create a tar.gz backup
```[tar](/man/tar) czf backup.tar.gz directory/```

## Extract a tar.gz archive
```[tar](/man/tar) xzf archive.tar.gz```

## Extract any archive format
```[atool](/man/atool) -x archive```

## Split large file
```[split](/man/split) -b 1G largefile part-```

## Reassemble split files
```[cat](/man/cat) part-* > largefile```

## Check file checksum
```[sha256sum](/man/sha256sum) file```

## Encrypt file with gpg
```[gpg](/man/gpg) -c file```

## Generate random password
```< /dev/urandom [tr](/man/tr) -dc A-Za-z0-9 | [head](/man/head) -c 32; echo```

## Copy with progress bar
```[rsync](/man/rsync) -ah --progress src dest```

## Progress bar for any pipe
```[pv](/man/pv) largefile | [gzip](/man/gzip) > largefile.gz```

## Create sparse 10GB file
```[truncate](/man/truncate) -s 10G file.img```

## Convert DOS to Unix line endings
```[dos2unix](/man/dos2unix) file```

## Pretty-print JSON from stdin
```[jq](/man/jq) .```

## Pretty-print XML
```[xmllint](/man/xmllint) --format file.xml```

## Pipe output to clipboard
```command | [xclip](/man/xclip) -sel clip```

## Run command in background
```command &```

## Run detached from terminal
```[nohup](/man/nohup) command &```

## Kill process by name
```[pkill](/man/pkill) process_name```

## View processes sorted by CPU
```[top](/man/top)```

## Check system uptime
```[uptime](/man/uptime)```

## List cron jobs
```[crontab](/man/crontab) -l```

## List hardware info
```[lshw](/man/lshw) -short```

## Monitor CPU temperature
```[sensors](/man/sensors)```

## Check battery percentage
```[upower](/man/upower) -i $(upower -e | grep BAT) | grep percentage```

## Show current timezone
```[timedatectl](/man/timedatectl)```

## Show calendar
```[cal](/man/cal)```

## Show previous, current, and next month
```[cal](/man/cal) -3```

## Create RAM disk
```[mount](/man/mount) -t tmpfs -o size=1G tmpfs /mnt/ram```

## Disk speed test
```[dd](/man/dd) if=/dev/zero of=test bs=1G count=1 oflag=dsync```

## Burn ISO to USB
```[dd](/man/dd) if=iso.iso of=/dev/sdX bs=4M status=progress```

## Securely wipe drive
```[shred](/man/shred) -v /dev/sdX```

## Record terminal session
```[script](/man/script) --log-timing timing.log session.log```

## Replay terminal session
```[scriptreplay](/man/scriptreplay) --log-timing timing.log session.log```

## Get your public IP address
```[curl](/man/curl) ifconfig.me```

## List open network ports
```[ss](/man/ss) -tuln```

## Download file with resume
```[wget](/man/wget) -c url```

## Mount remote directory over SSH
```[sshfs](/man/sshfs) user@host:/remote /local```

## Spin up a local HTTP server
```[python3](/man/python3) -m http.server 8000```

## Quick HTTP server in Ruby
```[ruby](/man/ruby) -run -e httpd . -p 8000```

## Quick HTTP server in PHP
```[php](/man/php) -S localhost:8000```

## Quick HTTP server in Node.js
```[npx](/man/npx) http-server```

## One-liner web server in bash
```while true; do echo -e "HTTP/1.1 200 OK\n\n$(date)" | nc -l 8080; done```

## Show weather in terminal
```[curl](/man/curl) wttr.in```

## Get full weather report
```[curl](/man/curl) v2.wttr.in```

## Generate QR code
```[qrencode](/man/qrencode) -t ANSI "text"```

## Download YouTube video
```[yt-dlp](/man/yt-dlp) url```

## Play YouTube video in terminal
```[mpv](/man/mpv) url```

## Play a video in terminal as ASCII
```[mplayer](/man/mplayer) -vo caca video.mp4```

## Convert image to different format
```[convert](/man/convert) input.jpg output.png```

## Create animated GIF from images
```[convert](/man/convert) -delay 10 -loop 0 *.png animation.gif```

## Convert video to GIF
```[ffmpeg](/man/ffmpeg) -i input.mp4 output.gif```

## Merge multiple PDFs
```[gs](/man/gs) -dBATCH -dNOPAUSE -sDEVICE=pdfwrite -sOutputFile=out.pdf in1.pdf in2.pdf```

## View PDF in terminal
```[pdftotext](/man/pdftotext) file.pdf - | [less](/man/less)```

## Show current git branch
```[git](/man/git) branch --show-current```

## Show git status nicely
```[git](/man/git) status -sb```

## Display system info with ASCII art
```[neofetch](/man/neofetch)```
```[screenfetch](/man/screenfetch)```

## Display fortune and cow
```[fortune](/man/fortune) | [cowsay](/man/cowsay)```

## Rainbow text
```echo "text" | [lolcat](/man/lolcat)```

## Simulate slow typing
```echo "text" | [pv](/man/pv) -qL 10```

## Matrix digital rain
```[cmatrix](/man/cmatrix)```

## Run the train animation
```[sl](/man/sl)```

## Play beep
```echo -e "\a"```
