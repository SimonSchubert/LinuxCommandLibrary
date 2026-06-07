# Backup & Imaging

## Backup Strategy
A good backup follows the **3-2-1 rule**: keep **3** copies of your data, on **2** different kinds of media, with **1** copy stored offsite. The tool you reach for depends on what you are protecting.

| Goal | Reach for |
|-----|-------------|
| **Sync files to another disk** | `[rsync](/man/rsync)` |
| **Versioned, deduplicated backups** | `[borg](/man/borg)`, `[restic](/man/restic)` |
| **Clone a whole disk or partition** | `[dd](/man/dd)`, `[partclone](/man/partclone)` |
| **Rescue a failing drive** | `[ddrescue](/man/ddrescue)` |
| **Push to cloud storage** | `[rclone](/man/rclone)` |
| **Snapshot a live filesystem** | `[lvm](/man/lvm)`, `[btrfs](/man/btrfs)`, `[zfs](/man/zfs)` |

> A backup you have never restored is only a hope. Test your restores regularly.

## File Backups with rsync
`rsync` copies only the differences between source and destination, which makes repeat backups fast. The `-a` (archive) flag preserves permissions, timestamps, symlinks, and ownership.
```[rsync](/man/rsync) -a /home/user/ /mnt/backup/user/```
```[rsync](/man/rsync) -ah --info=progress2 /data/ /mnt/backup/data/```

Add `--delete` to mirror the source exactly, removing files from the destination that no longer exist in the source.
```[rsync](/man/rsync) -a --delete /data/ /mnt/backup/data/```

A trailing slash on the source matters: `src/` copies the **contents** of src, while `src` copies the **directory** src itself.

| Flag | Description |
|-----|-------------|
| **-a** | Archive mode (preserve metadata, recurse) |
| **-v** | Verbose output |
| **-z** | Compress data during transfer |
| **-h** | Human-readable sizes |
| **--delete** | Remove extra files from destination |
| **-n / --dry-run** | Show what would happen, change nothing |
| **--exclude** | Skip matching paths |
| **--progress** | Show per-file progress |

> Always do a `--dry-run` first when using `--delete`, so you can confirm nothing important will be wiped.

## Backups over SSH
`rsync` can back up to or from a remote host over SSH, transferring only changes.
```[rsync](/man/rsync) -avz -e [ssh](/man/ssh) /data/ user@host:/backup/data/```
```[rsync](/man/rsync) -avz user@host:/var/www/ /mnt/backup/www/```

For a quick one-off copy of a single file, `scp` is simpler.
```[scp](/man/scp) backup.tar.gz user@host:/backup/```

## Incremental Snapshots
With `--link-dest`, `rsync` hard-links unchanged files to a previous backup, so each snapshot looks complete but only uses extra space for files that changed.
```[rsync](/man/rsync) -a --delete --link-dest=/backup/prev /data/ /backup/2026-06-06/```

This gives you browseable, dated snapshots at the storage cost of an incremental backup. Rotate by pointing each new run at the previous day's directory.

## Archiving Backups
A `tar` archive bundles many files into one, ideal for a point-in-time snapshot. Combine with compression to save space.
```[tar](/man/tar) czf backup-$(date +%F).tar.gz /home/user```
```[tar](/man/tar) xzf backup-2026-06-06.tar.gz```

For large datasets, `zstd` is faster and compresses well; pipe `tar` through it.
```[tar](/man/tar) cf - /data | [zstd](/man/zstd) -19 -o data.tar.zst```

`tar` supports **incremental** archives with a snapshot file that tracks what changed between runs.
```[tar](/man/tar) czg backup.snar -f full.tar.gz /data```
```[tar](/man/tar) czg backup.snar -f incr.tar.gz /data```

Stream an archive straight to a remote host without a temporary file.
```[tar](/man/tar) czf - /data | [ssh](/man/ssh) user@host "cat > /backup/data.tar.gz"```

> See the **Compression & Archiving** basics page for the full set of `tar`, `gzip`, `xz`, and `zstd` options.

## Snapshot & Dedup Tools
Dedicated backup programs add deduplication, encryption, compression, and retention policies on top of plain copies. They store each file's blocks once, so re-running a backup is cheap.

| Tool | Strengths |
|-----|-------------|
| `[borg](/man/borg)` | Dedup, compression, encryption, mountable archives |
| `[restic](/man/restic)` | Simple, fast, many cloud backends built in |
| `[duplicity](/man/duplicity)` | Encrypted incremental backups via GPG |
| `[bup](/man/bup)` | Git-based dedup, handles huge files well |
| **rsnapshot** | rsync plus hard-link rotation, no extra format |

Initialize a `borg` repository, then create a compressed, deduplicated archive.
```[borg](/man/borg) init --encryption=repokey /mnt/backup/repo```
```[borg](/man/borg) create --compression zstd /mnt/backup/repo::{now} /home/user```

`restic` works the same way and speaks to local disks, SFTP, S3, and more.
```[restic](/man/restic) -r /mnt/backup/repo init```
```[restic](/man/restic) -r /mnt/backup/repo backup /home/user```

Prune old snapshots with a retention policy so backups do not grow forever.
```[borg](/man/borg) prune --keep-daily=7 --keep-weekly=4 /mnt/backup/repo```

## Disk & Partition Imaging
`dd` copies data block by block, making an exact image of a disk or partition. Identify the target device first with `lsblk` and double-check it.
```[lsblk](/man/lsblk)```
```[dd](/man/dd) if=/dev/sda of=/dev/sdb bs=64K status=progress```

Save a partition to a compressed image file instead of another disk.
```[dd](/man/dd) if=/dev/sda1 bs=4M status=progress | [gzip](/man/gzip) > sda1.img.gz```

Restore an image back onto a device.
```[gunzip](/man/gunzip) -c sda1.img.gz | [dd](/man/dd) of=/dev/sda1 bs=4M status=progress```

> `dd` writes wherever you point it with no confirmation. A wrong `of=` value will destroy data instantly. Check the device name twice, then once more.

| Option | Description |
|-----|-------------|
| **if=** | Input file or device |
| **of=** | Output file or device |
| **bs=** | Block size (larger is usually faster) |
| **status=progress** | Show transfer progress |
| **conv=noerror,sync** | Keep going past read errors, pad blocks |
| **count=** | Copy only N blocks |

## Writing Images to USB
To write an installer ISO to a USB stick, `dd` it to the whole device (not a partition).
```[dd](/man/dd) if=distro.iso of=/dev/sdc bs=4M status=progress oflag=sync```

Plain `cp` and `cat` can also stream an image to a device.
```[cp](/man/cp) distro.iso /dev/sdc && [sync](/man/sync)```

Wipe old filesystem signatures from a device before reusing it.
```[wipefs](/man/wipefs) -a /dev/sdc```

## Resilient Imaging & Recovery
When a drive is failing, use `ddrescue` instead of `dd`: it retries bad sectors, works from the easy areas first, and keeps a map file so it can resume later.
```[ddrescue](/man/ddrescue) /dev/sda rescue.img rescue.map```
```[ddrescue](/man/ddrescue) -r3 /dev/sda rescue.img rescue.map```

`partclone` images only the **used** blocks of a filesystem, so it is faster and smaller than a full `dd` of an empty-ish partition.
```[partclone](/man/partclone).ext4 -c -s /dev/sda1 -o sda1.img```

For accidentally deleted files or corrupted partition tables, `testdisk` repairs partitions and `photorec` carves files back by signature.
```[testdisk](/man/testdisk) /dev/sda```
```[photorec](/man/photorec) /dev/sda```

`clonezilla` wraps these tools into a guided disk-cloning environment for bare-metal backups.
```[clonezilla](/man/clonezilla)```

## Filesystem-level Snapshots
Modern filesystems and volume managers can snapshot a live system instantly, giving you a stable, consistent view to back up from.

| System | Create a snapshot |
|-----|-------------|
| **LVM** | `lvcreate -s -n snap -L 5G /dev/vg/lv` |
| **Btrfs** | `btrfs subvolume snapshot / /snap` |
| **ZFS** | `zfs snapshot pool/data@backup` |

Create an LVM snapshot, back it up while the system keeps running, then remove it.
```[lvcreate](/man/lvcreate) -s -n root_snap -L 5G /dev/vg0/root```
```[btrfs](/man/btrfs) subvolume snapshot -r / /.snapshots/2026-06-06```
```[zfs](/man/zfs) snapshot tank/home@2026-06-06```

> Snapshots live on the same disk and are not a backup by themselves. Copy them somewhere else.

## Cloud & Remote Sync
`rclone` syncs files to dozens of cloud providers (S3, Backblaze, Google Drive, and more) after a one-time `rclone config`.
```[rclone](/man/rclone) copy /data remote:backup/data```
```[rclone](/man/rclone) sync /data remote:backup/data --progress```

Mount a remote as a local folder, or check what would change without transferring.
```[rclone](/man/rclone) mount remote:backup /mnt/remote```
```[rclone](/man/rclone) sync /data remote:backup --dry-run```

## Verify & Automate
A backup is only good if it is intact. Record checksums when you make a backup, then verify them on restore.
```[sha256sum](/man/sha256sum) backup.tar.gz > backup.sha256```
```[sha256sum](/man/sha256sum) -c backup.sha256```

Schedule backups so they actually happen. Edit your crontab and add a nightly job.
```[crontab](/man/crontab) -e```
```0 2 * * * [rsync](/man/rsync) -a --delete /data/ /mnt/backup/data/```

> Automate the backup, but verify restores by hand on a schedule. The only proven backup is one you have successfully restored.
