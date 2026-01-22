# TLDR

Display **all** hardware information

```hwinfo```

Display **specific component** info

```hwinfo --cpu```

Display component info **briefly**

```hwinfo --disk --short```

**Write** all info to file

```hwinfo --all --log hardware.txt```

Display **memory** information

```hwinfo --memory```

Display **network** devices

```hwinfo --network```

# SYNOPSIS

**hwinfo** [_--component_] [_--short_] [_--log file_]

# DESCRIPTION

**hwinfo** probes for hardware present in the system and provides detailed information about detected devices. It can report on individual components or all hardware at once.

# PARAMETERS

**--short**
> Show brief summary instead of full details

**--all**
> Probe for all hardware

**--log FILE**
> Write output to specified file

**--debug LEVEL**
> Set debug level (0-255)

**--dump-db LEVEL**
> Dump hardware database

# HARDWARE COMPONENTS

**--cpu**: Processor information
**--memory**: RAM and memory
**--disk**: Hard drives and SSDs
**--partition**: Disk partitions
**--network**: Network adapters
**--gfxcard**: Graphics cards
**--sound**: Audio devices
**--usb**: USB devices
**--pci**: PCI devices
**--keyboard**: Keyboards
**--mouse**: Pointing devices
**--monitor**: Display monitors
**--framebuffer**: Framebuffer devices
**--cdrom**: CD/DVD drives
**--bios**: BIOS information
**--fingerprint**: Fingerprint readers
**--bluetooth**: Bluetooth devices

# CAVEATS

Some hardware detection requires root privileges. Full probing (--all) can take significant time. The tool is primarily developed for openSUSE but works on other distributions.

# HISTORY

**hwinfo** was developed by SUSE for hardware detection in Linux. It provides one of the most comprehensive hardware probing utilities available.

# SEE ALSO

[lshw](/man/lshw)(1), [lspci](/man/lspci)(8), [lsusb](/man/lsusb)(8), [dmidecode](/man/dmidecode)(8)
