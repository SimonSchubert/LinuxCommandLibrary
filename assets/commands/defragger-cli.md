# TAGLINE

analyze and defragment Linux filesystems from the terminal

# TLDR

**List** volumes Defragger can see, with filesystem type and support

```defragger-cli list```

**Analyze** fragmentation on a mounted ext4 partition

```defragger-cli analyze [/dev/nvme0n1p2]```

Analyze by **mount point** instead of a device node

```defragger-cli analyze [/mnt/data]```

**Defragment** an ext4 volume (requires confirmation)

```defragger-cli defrag [/dev/nvme0n1p2] --yes```

**Compact** an unmounted FAT16/FAT32 volume toward low cluster addresses

```defragger-cli compact [/dev/sdb1] --yes```

Run against the **in-process** unprivileged client (no systemd helper)

```defragger-cli --direct list```

Fail if extra fragments **remain** after defrag

```defragger-cli defrag [/dev/nvme0n1p2] --yes --require-fully-defragmented```

# SYNOPSIS

**defragger-cli** [**--direct**] **list**

**defragger-cli** [**--direct**] **analyze** _DEVICE_OR_MOUNT_

**defragger-cli** [**--direct**] **defrag** _DEVICE_OR_MOUNT_ **--yes** [**--require-fully-defragmented**]

**defragger-cli** [**--direct**] **compact** _DEVICE_OR_MOUNT_ **--yes** [**--require-fully-defragmented**]

# SUBCOMMANDS

**list**
> Print a table of discovered volumes: source device, filesystem, mount state, mount point, occupancy, and support (analysis-only, defragmentable, or unsupported).

**analyze** _DEVICE_OR_MOUNT_
> Scan the selected volume and print coverage, fragmented-file counts, extra fragments, and completeness. Progress lines go to standard error.

**defrag** _DEVICE_OR_MOUNT_
> Analyze, plan, then rewrite fragmented files that already have a wholly free contiguous destination. Requires **--yes**. Prints a BEFORE report, plan size, live progress, and an AFTER (or STOPPED) report.

**compact** _DEVICE_OR_MOUNT_
> Analyze, plan, then pack movable FAT16/FAT32 files toward low cluster addresses. Directories, bad clusters, and other pinned regions split the packed areas. Requires **--yes**. Not available on ext4.

**help**, **-h**, **--help**
> Print usage. This is the default when no command is given.

# PARAMETERS

**--direct**
> Talk to the in-process unprivileged client instead of the PolicyKit-authorized helper. Use this when systemd or a graphical PolicyKit agent is unavailable. The flag may appear before the subcommand.

**--yes**
> Required for **defrag** and **compact**. Those commands modify the filesystem and refuse to run without this confirmation.

**--require-fully-defragmented**
> After **defrag** or **compact**, exit with an error if any extra fragments remain. **--require-zero-excess** is a legacy alias for the same flag.

_DEVICE_OR_MOUNT_
> Device path (**/dev/nvme0n1p2**), mount point, **/dev/disk** symlink, or loop backing-image path. The CLI matches the argument against the helper's volume list.

# DESCRIPTION

**defragger-cli** is the command-line client of **Defragger**, a Linux filesystem analyzer and defragmenter. It is not a wrapper around **e4defrag** or **filefrag**. For ext4 it reads allocation maps with **FS_IOC_GETFSMAP**, maps files with **FS_IOC_FIEMAP**, and moves extents with **EXT4_IOC_MOVE_EXT**. Classic FAT volumes are parsed and rewritten by Defragger's own FAT backend.

The CLI itself never runs as root. Privileged discovery, analysis, and writes go through a narrow D-Bus helper authorized by PolicyKit (**net.gootz.defragger.read-all-files** and **net.gootz.defragger.modify-filesystem**). The helper accepts opaque operation IDs, not paths or shell commands. A system install also ships a Kirigami/Qt graphical front end named **defragger**, which talks to the same service.

Supported operations by filesystem:

> **ext4**: online analysis and online defragmentation. Offline ext4 is privately mounted in the helper's mount namespace; a dirty journal is replayed only after modification authorization.

> **FAT16/FAT32**: online analysis; defragmentation and compaction only while the volume is unmounted. Compact packs data toward the start of the filesystem.

> **FAT12** and **exFAT**: analysis only. Those filesystems are never written.

**list** reports each volume as **mounted-rw**, **mounted-ro**, or **unmounted**, and whether it is **defragmentable**, **analysis-only**, or **unsupported**. **analyze** prints a **VOLUME** line (filesystem, capacity, used, free, occupancy) plus an **ANALYSIS** summary. **defrag** and **compact** print **BEFORE**, a **PLAN** (candidate count, estimated rewrite bytes, excluded files), then **AFTER** or **STOPPED**. Progress, pending I/O ranges, and per-file fragment updates go to standard error.

SIGINT and SIGTERM cancel at a safe boundary (before a move, or after a range-sync). The CLI waits for that boundary instead of aborting mid-extent.

# CAVEATS

This is **alpha** filesystem software. Back up important data before write operations. The ext4 path has received the most testing; FAT write support is newer and should first be used on disposable or fully backed-up volumes.

**defrag** and **compact** require **--yes**. Defrag only relocates a file when a free contiguous destination already exists, so a nearly full filesystem may leave extra fragments. Compact is FAT16/FAT32 only and refuses mounted volumes.

Privileged mode needs **systemd**, **PolicyKit**, and an active graphical PolicyKit agent. Without those, use **--direct** (or a build without the helper). **--direct** is unprivileged: it cannot perform root-only mapping and write ioctls.

Linux does not expose a filesystem-wide allocation map for mounted FAT/exFAT, so those analysis reports are marked partial. FAT has no journal: a crash during write can leave unreferenced allocated clusters for **fsck**, though the writer verifies copied clusters before redirecting directory metadata.

An ext4 volume with the on-disk error flag set is not mounted writable. **EBADMSG** from the allocation-map ioctl is treated as corruption, not a display glitch.

# HISTORY

Defragger was written in **2026** by Guillaume Binet as a Linux analogue of the classic Windows graphical defragmenter, then extended into a real filesystem tool when extent layout affected a high-throughput logger. The project is dual-licensed **MIT** or **Apache-2.0**. Version **0.1.0** is tagged alpha. The CLI binary installed by CMake is **defragger-cli**; the graphical application is **defragger**.

# SEE ALSO

[e4defrag](/man/e4defrag)(8), [filefrag](/man/filefrag)(8), [e2freefrag](/man/e2freefrag)(8), [fsck](/man/fsck)(8)

# RESOURCES

```[Source code](https://github.com/gbin/defragger)```

```[Documentation](https://github.com/gbin/defragger/blob/main/docs/architecture.md)```

<!-- verified: 2026-08-30 -->
