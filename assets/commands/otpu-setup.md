# TAGLINE

Install the XDMA driver, udev rules, and options for an openTPU FPGA card

# TLDR

**Install or update** the driver and udev rules, then load it

```otpu-setup```

**Report** what is installed without changing anything

```otpu-setup --check```

**Rescan** the PCIe bus after a JTAG bitstream load

```otpu-setup --rescan```

Install the driver in **poll mode**

```otpu-setup --poll```

Install with **interrupts**

```otpu-setup --irq```

Install the module for **this kernel only** (no DKMS)

```otpu-setup --no-dkms```

**Remove** the driver, rules, and module options

```otpu-setup --uninstall```

# SYNOPSIS

**otpu-setup** [**--check** | **--rescan** | **--uninstall**] [**--poll** | **--irq**] [**--no-dkms**] [**--src** _dir_]

# DESCRIPTION

**otpu-setup** is the host PC setup command for an **openTPU** card. It is a console-script front end for `setup_pcie.sh` in the FeSens/openTPU package: arguments pass through, and the script re-execs itself with **sudo** except for **--check**. After `pip install -e .` in that tree it is installed as `otpu-setup`.

The default mode installs or updates Xilinx's **dma_ip_drivers** XDMA module at a pinned commit, plus the package's `xdma-otpu.patch` (a Makefile fix for kernels ≥ 6.13 and an **otpu** module tag). The module goes to `/lib/modules/<kernel>/updates`, which takes precedence over the kernel's own `xdma` (AMD's Alveo platform driver, which does not drive this card). With DKMS it is rebuilt at every kernel upgrade. The script then writes udev rules, optional `poll_mode` in `/etc/modprobe.d/otpu-xdma.conf`, loads the driver, and reads the card's ID register (**OTPU** at BAR0).

**--check** reports what is installed and working and changes nothing (exit **1** when something is missing or wrong). **--rescan** is the path after a JTAG load: it removes the card from the bus, rescans, binds the driver, waits for `/dev/xdma0_user`, and reads the ID register; if the card is not back it retrains the upstream port. **--uninstall** removes what install put on the system.

Linux only. Safe to re-run: every step checks first and changes only what differs. The driver is never unloaded under a running program; a pending reload waits for **--rescan** or a reboot.

# PARAMETERS

**--check**
> Report driver, devices, PCIe link, and ID register. Change nothing.

**--rescan**
> Remove the card from the bus, rescan, bind XDMA, wait for `/dev/xdma0_user`, read the ID register.

**--uninstall**
> Remove the module, DKMS entry, udev rules, and modprobe options.

**--poll**
> Set `poll_mode=1` in `/etc/modprobe.d/otpu-xdma.conf`.

**--irq**
> Set `poll_mode=0` (interrupts). Without **--poll** or **--irq**, an existing setting stays and a new install uses interrupts.

**--no-dkms**
> Install the module for the running kernel only, even when DKMS is available.

**--src** _dir_
> Use a local **dma_ip_drivers** git clone at the pinned commit instead of fetching from GitHub.

**-h**, **--help**
> Print the script's comment header and exit.

# CAVEATS

Must run on the Linux PC that holds the card. Modes other than **--check** need root (the script calls **sudo** itself). After a kernel upgrade without DKMS, re-run the command; **--check** says when the module is missing for the running kernel. An ID register of `0xffffffff` means the card was reprogrammed after enumeration: use **--rescan**. DMA hang or timeouts sometimes need **--poll**. The PCI id expected is **10ee:7028**. The command is installed only via `pip install -e .` in the openTPU tree.

# HISTORY

**otpu-setup** is part of the **openTPU** host tools (Apache-2.0, FeSens). It packages the XDMA bring-up from `docs/host.md` so `sudo otpu-setup` then **otpu-chat --backend board** is the documented path onto a programmed Kintex-7 card.

# SEE ALSO

[otpu-selftest](/man/otpu-selftest)(1), [otpu-diag](/man/otpu-diag)(1), [otpu-memcal](/man/otpu-memcal)(1), [otpu-chat](/man/otpu-chat)(1), [lspci](/man/lspci)(1), [modprobe](/man/modprobe)(1), [dkms](/man/dkms)(1)

# RESOURCES

```[Source code](https://github.com/FeSens/openTPU)```

```[Documentation](https://github.com/FeSens/openTPU/blob/main/docs/host.md)```

<!-- verified: 2026-10-21 -->
