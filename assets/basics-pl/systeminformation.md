# Informacje o systemie

## Użycie CPU w procentach
```HZ=`[awk](/man/awk) '/\#define HZ/ { print $3}' /usr/include/asm-generic/param.h`; NUMCPUS=`[grep](/man/grep) ^proc /proc/cpuinfo | [wc](/man/wc) -l`; FIRST=`[cat](/man/cat) /proc/stat | [awk](/man/awk) '/^cpu / { print $5}'`; [sleep](/man/sleep) 1; SECOND=`[cat](/man/cat) /proc/stat | [awk](/man/awk) '/^cpu / { print $5}'`; USED=`[echo](/man/echo) 4 k 100 $SECOND $FIRST - $NUMCPUS $HZ \* / 100 \* - p | [dc](/man/dc)`; [echo](/man/echo) ${USED}` ```

## Naładowanie baterii laptopa w procentach
```[upower](/man/upower) -i $([upower](/man/upower) -e | [grep](/man/grep) BAT) | [grep](/man/grep) --color=never -E percentage | [xargs](/man/xargs) | [cut](/man/cut) -d' ' -f2 | [sed](/man/sed) 's/%//'```

## Interfejsy sieciowe
```[ifconfig](/man/ifconfig) -a```
```[ip](/man/ip) a```

## Informacje o pamięci
```[cat](/man/cat) /proc/meminfo```

## Informacje o systemie Linux
```[uname](/man/uname) -a```
```[neofetch](/man/neofetch)```
```[hostnamectl](/man/hostnamectl)```
```[lsb_release](/man/lsb_release) -a```

## Urządzenia PCI
```[lspci](/man/lspci)```

## Urządzenia USB
```[lsusb](/man/lsusb)```

## Urządzenia blokowe (poza RAM) w postaci drzewa
```[lsblk](/man/lsblk)```

## Czas działania systemu
```[uptime](/man/uptime)```

## Informacje o użyciu dysku
```[df](/man/df) -h```
```[duf](/man/duf)```

## Informacje o CPU
```[lscpu](/man/lscpu)```
```[cat](/man/cat) /proc/cpuinfo```

## Uruchomione procesy
```[ps](/man/ps) aux```
```[top](/man/top)```
```[htop](/man/htop)```
```[btop](/man/btop)```

## Użycie pamięci
```[free](/man/free) -h```
```[vmstat](/man/vmstat)```

## Komunikaty jądra
```[dmesg](/man/dmesg)```

## Załadowane moduły jądra
```[lsmod](/man/lsmod)```

## Wyświetl partycje dysku
```[fdisk](/man/fdisk) -l```
```[parted](/man/parted) -l```
