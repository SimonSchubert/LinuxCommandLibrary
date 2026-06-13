# System information

## OS & Kernel
Which distribution, which kernel, and how long has it been running?
```[uname](/man/uname) -a```
```[hostnamectl](/man/hostnamectl)```
```[lsb_release](/man/lsb_release) -a```
```[cat](/man/cat) /etc/os-release```
```[uptime](/man/uptime)```

Pretty system overviews for screenshots and quick orientation.
```[fastfetch](/man/fastfetch)```
```[neofetch](/man/neofetch)```
```[inxi](/man/inxi) -Fz```

## CPU
**lscpu** summarizes model, cores, and features; /proc/cpuinfo has the raw per-core details.
```[lscpu](/man/lscpu)```
```[cat](/man/cat) /proc/cpuinfo```

Current CPU load: **top** in batch mode for a one-shot value, **mpstat** for per-core statistics, **vmstat** for a rolling view.
```[top](/man/top) -bn1 | [grep](/man/grep) "Cpu(s)"```
```[mpstat](/man/mpstat) 1 5```
```[vmstat](/man/vmstat) 1```

## Memory
**free -h** answers the common question; /proc/meminfo has every detail.
```[free](/man/free) -h```
```[cat](/man/cat) /proc/meminfo```
```[vmstat](/man/vmstat)```

In **free**, look at the "available" column, not "free": Linux uses spare RAM for disk cache and releases it when programs need it.

## Processes
Snapshot with **ps**, live view with **top** or one of its friendlier successors.
```[ps](/man/ps) aux```
```[ps](/man/ps) aux --sort=-%mem | [head](/man/head)```
```[top](/man/top)```
```[htop](/man/htop)```
```[btop](/man/btop)```
```[atop](/man/atop)```

## Disks & Partitions
Free space per filesystem, block devices as a tree, and partition tables (root required for fdisk/parted).
```[df](/man/df) -h```
```[duf](/man/duf)```
```[lsblk](/man/lsblk) -f```
```[fdisk](/man/fdisk) -l```
```[parted](/man/parted) -l```

## Hardware
List devices by bus, or get the full inventory including model numbers.
```[lspci](/man/lspci)```
```[lsusb](/man/lsusb)```
```[lshw](/man/lshw) -short```
```[dmidecode](/man/dmidecode) -t memory```

Temperatures and fan speeds (run **sensors-detect** once first).
```[sensors](/man/sensors)```

## Battery
**upower** reports detailed battery state; **acpi** gives the one-line answer. The raw values live in /sys.
```[acpi](/man/acpi) -b```
```[upower](/man/upower) -i $([upower](/man/upower) -e | [grep](/man/grep) BAT)```
```[cat](/man/cat) /sys/class/power_supply/BAT*/capacity```

## Bluetooth
**bluetoothctl** is the current tool; **hciconfig** is deprecated but still found on older systems.
```[bluetoothctl](/man/bluetoothctl) show```
```[bluetoothctl](/man/bluetoothctl) devices```
```[hciconfig](/man/hciconfig) -a```

## Network Interfaces
```[ip](/man/ip) a```
```[ifconfig](/man/ifconfig) -a```

## Kernel & Boot Messages
**dmesg** prints the kernel ring buffer (root on most distributions); **journalctl -b** shows everything logged since this boot.
```[dmesg](/man/dmesg)```
```[dmesg](/man/dmesg) -w```
```[journalctl](/man/journalctl) -b```
```[lsmod](/man/lsmod)```
