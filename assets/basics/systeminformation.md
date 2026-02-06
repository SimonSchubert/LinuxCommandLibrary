# System information

## CPU usage in percentage
```HZ=`[awk](/man/awk) '/\#define HZ/ { print $3}' /usr/include/asm-generic/param.h`; NUMCPUS=`[grep](/man/grep) ^proc /proc/cpuinfo | [wc](/man/wc) -l`; FIRST=`[cat](/man/cat) /proc/stat | [awk](/man/awk) '/^cpu / { print $5}'`; [sleep](/man/sleep) 1; SECOND=`[cat](/man/cat) /proc/stat | [awk](/man/awk) '/^cpu / { print $5}'`; USED=`[echo](/man/echo) 4 k 100 $SECOND $FIRST - $NUMCPUS $HZ \* / 100 \* - p | [dc](/man/dc)`; [echo](/man/echo) ${USED}` ```
```NUMCPUS=`[grep](/man/grep) ^proc /proc/cpuinfo | [wc](/man/wc) -l`; FIRST=`[cat](/man/cat) /proc/stat | [awk](/man/awk) '/^cpu / { print $5}'`; [sleep](/man/sleep) 1; SECOND=`[cat](/man/cat) /proc/stat | [awk](/man/awk) '/^cpu / { print $5}'`; USED=`[echo](/man/echo) 2 k 100 $SECOND $FIRST - $NUMCPUS / - p | [dc](/man/dc)`; [echo](/man/echo) ${USED}%```

## Laptop battery in percentage
```max=$([grep](/man/grep) 'last full capacity:' /proc/acpi/battery/BAT1/info | [awk](/man/awk) '{ print $4}'); current=$([grep](/man/grep) 'remaining capacity:' /proc/acpi/battery/BAT1/state | [awk](/man/awk) '{ print $3}'); percent=$([expr](/man/expr) $current'00' / $max); [echo](/man/echo) -e $percent```
```[upower](/man/upower) -i $([upower](/man/upower) -e | [grep](/man/grep) BAT) | [grep](/man/grep) --color=never -E percentage | [xargs](/man/xargs) | [cut](/man/cut) -d' ' -f2 | [sed](/man/sed) 's/%//'```
```[cat](/man/cat) /sys/class/power_supply/BAT1/uevent | [awk](/man/awk) '/POWER_SUPPLY_CAPACITY/ { print $1}' | [sed](/man/sed) 's/POWER_SUPPLY_CAPACITY=//'```

## Bluetooth MAC address
```[hciconfig](/man/hciconfig) -a | [awk](/man/awk) '/BD Address:/ { print $3}'```

## Bluetooth name
```[hciconfig](/man/hciconfig) -a | [awk](/man/awk) '/Name:/ { print $2}'```

## Network interfaces
```[ifconfig](/man/ifconfig) -a```
```[ip](/man/ip) a```

## Memory information
```[cat](/man/cat) /proc/meminfo```

## Info about the Linux system
```[cat](/man/cat) /proc/version```
```[uname](/man/uname) -a```
```[neofetch](/man/neofetch)```
```[hostnamectl](/man/hostnamectl)```
```[lsb_release](/man/lsb_release) -a```

## PCI devices
```[lspci](/man/lspci)```

## USB devices
```[lsusb](/man/lsusb)```

## Block devices (except RAM disks) in a tree-like format
```[lsblk](/man/lsblk)```

## Uptime of machine
```[uptime](/man/uptime)```

## Disk usage info
```[df](/man/df) -k```
```[df](/man/df) -h```
```[duf](/man/duf)```

## Bootlog info
```[cat](/man/cat) /var/log/boot.log```

## Show a small monthly calendar
```[cal](/man/cal)```

## CPU information
```[lscpu](/man/lscpu)```
```[cat](/man/cat) /proc/cpuinfo```

## Show running processes
```[ps](/man/ps) aux```
```[top](/man/top)```
```[htop](/man/htop)```
```[btop](/man/btop)```
```[atop](/man/atop)```

## Memory usage
```[free](/man/free) -h```
```[vmstat](/man/vmstat)```

## Kernel messages
```[dmesg](/man/dmesg)```

## Loaded kernel modules
```[lsmod](/man/lsmod)```

## Show disk partitions
```[fdisk](/man/fdisk) -l```
```[parted](/man/parted) -l```
