# TAGLINE

Securely erase disks with multi-pass methods

# TLDR

**Launch interactive wipe** of detected disks (ncurses UI)

```sudo nwipe```

**Wipe specific devices** with the interactive UI

```sudo nwipe /dev/sdb /dev/sdc```

**Auto-wipe listed devices** without the GUI (unattended)

```sudo nwipe --autonuke --nogui /dev/sdb```

**Quick zero-fill** a disk (single zero pass)

```sudo nwipe --method=zero /dev/sdb```

**DoD 3-pass wipe** with verification of the last pass

```sudo nwipe --method=dodshort --verify=last /dev/sdb```

**Exclude system disk** and wipe everything else immediately

```sudo nwipe --autonuke --exclude=/dev/sda```

**Log wipe progress** to a file

```sudo nwipe --logfile=/var/log/nwipe.log /dev/sdb```

**Use PRNG stream** method with multiple rounds

```sudo nwipe --method=prng --rounds=2 /dev/sdb```

# SYNOPSIS

**nwipe** [*options*] [*device1*] [*device2*] ...

# PARAMETERS

**-V**, **--version**
> Print the version number

**-h**, **--help**
> Print a help summary

**-v**, **--verbose**
> Log more messages (debugging)

**-q**, **--quiet**
> Anonymize serial numbers in the GUI and logs

**-m**, **--method**=*METHOD*
> Wipe method (default: **prng**). Common values: **prng** / **random** / **stream**, **zero** / **quick**, **one**, **dodshort** / **dod3pass**, **dod522022m** / **dod**, **gutmann**, **ops2**, **is5enh**, **bruce7**, **bmb**, **verify_zero**, **verify_one**

**-r**, **--rounds**=*NUM*
> Number of times to run the selected method (default: 1)

**-p**, **--prng**=*METHOD*
> PRNG for random-based methods: **mersenne**, **twister**, **isaac**, **isaac64**, **xoroshiro256_prng**, **aes_ctr_prng**, **chacha20**, and others; **auto** benchmarks and picks the fastest (default)

**--prng-benchmark**
> Run a RAM-only PRNG throughput benchmark and exit (no wipe)

**--verify**=*TYPE*
> Verification mode: **off**, **last** (default), or **all**

**--autonuke**
> Start wiping immediately (all detected devices if none listed, otherwise only the listed ones)

**--nogui**
> No interactive UI; requires **--autonuke**. Implies **--nowait**

**--nowait**
> Do not wait for a key before exiting

**--noblank**
> Skip the final blanking pass after the wipe

**--nousb**
> Do not show or wipe USB devices

**--force**
> Allow wiping devices that appear in use (mounted). Dangerous; disabled by default

**-e**, **--exclude**=*DEVICES*
> Comma-separated devices to exclude (up to ten)

**-l**, **--logfile**=*FILE*
> Log file path (default: STDOUT)

**-P**, **--PDFreportpath**=*DIR*
> Directory for PDF wipe certificates (default: **.**); set to **noPDF** to disable

**--sync**=*NUM*
> How often to **fdatasync** during cached I/O (device blocks between syncs; default 100000)

**--directio** / **--cachedio** / **--io-mode**=*MODE*
> I/O path: direct (**O_DIRECT**), cached, or **auto** / **cached** / **direct**

**--autopoweroff**
> Power off one minute after a successful wipe (abort with **shutdown -c**)

**--nosignals**
> Do not allow signals to interrupt a wipe

**--reverse**
> Write from end of device toward start (helpful past bad blocks)

**--scatter**
> Scattered/random segment order (stress-test style; may be slower)

# DESCRIPTION

**nwipe** securely erases the entire contents of block devices using a variety of recognized multi-pass methods. It is a maintained fork of the **dwipe** engine from Darik's Boot and Nuke (DBAN), designed to run on any Linux host distribution (and is also the wipe engine in **ShredOS** bootable media).

Without options, nwipe presents an interactive ncurses interface listing detected disks so you can select targets and methods. Devices may be given as classic nodes (**/dev/sda**, **/dev/nvme0n1**) or stable paths under **/dev/disk/by-id/**. Multiple disks can be wiped in parallel.

Methods range from a single zero or ones pass, through DoD 5220.22-M variants and Gutmann, to PRNG streams and standards such as HMG IS5 enhanced, Schneier (**bruce7**), and BMB21-2019. Random-based methods use PRNGs seeded via **getrandom**(2). Optional verification re-reads after the last pass (or every pass). PDF wipe certificates can be written for auditing.

Compared with file-oriented tools like **shred**, nwipe is aimed at whole-disk sanitization with a drive-selection UI, multi-disk operation, logging, and certificate generation.

# CAVEATS

Wiping destroys all data on the target devices permanently. Always double-check device names and use **--exclude** for the system disk when using **--autonuke**. **--force** can wipe mounted filesystems and is dangerous.

On SSDs and NVMe, software multi-pass overwrites may not touch remapped cells the way ATA Secure Erase or **nvme format**/sanitize does; prefer hardware secure-erase features when available and policy allows. Faulty drives with I/O errors may take a very long time unless **--no-retry-on-io-errors** is used. Cached I/O defers error detection until sync; **--sync=0** only syncs at end of pass and is not recommended.

# HISTORY

**nwipe** forked **dwipe** from DBAN so the same wipe engine could run outside the DBAN live environment on ordinary Linux distributions, with better hardware support. It uses pthreads instead of fork, the parted library for drive detection, and has gained additional methods, PRNGs, I/O modes, stable device paths, and PDF certificates over time. It is maintained by Martijn van Brummelen and collaborators (including ShredOS-related work by Nick Law / PartialVolume).

# INSTALL

```apt: sudo apt install nwipe```

```dnf: sudo dnf install nwipe```

```aur: yay -S nwipe```

```apk: sudo apk add nwipe```

```nix: nix profile install nixpkgs#nwipe```

<!-- packages: 2026-07-25 -->

# SEE ALSO

[shred](/man/shred)(1), [dd](/man/dd)(1), [wipe](/man/wipe)(1), [wipefs](/man/wipefs)(8), [badblocks](/man/badblocks)(8)

# RESOURCES

```[Source code](https://github.com/martijnvanbrummelen/nwipe)```

<!-- verified: 2026-07-25 -->
