# TAGLINE

displays information about installed hardware detected by the kernel, reading

# TLDR

List **installed hardware**

```lsdev```

# SYNOPSIS

**lsdev**

# DESCRIPTION

**lsdev** displays information about installed hardware detected by the kernel, reading from /proc/interrupts, /proc/ioports, and /proc/dma. It shows device names with their associated IRQ, DMA, and I/O port ranges.

# CAVEATS

Part of the procinfo package. Provides a simple overview; use lspci, lsusb, or lshw for detailed hardware information.

# SEE ALSO

[lspci](/man/lspci)(8), [lsusb](/man/lsusb)(8), [lshw](/man/lshw)(1), [hwinfo](/man/hwinfo)(8)
