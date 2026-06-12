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
When either side of an `rsync` is `user@host:path`, the transfer runs over SSH automatically, still copying only changes. Add `-z` to compress on slow links.
```[rsync](/man/rsync) -avz /data/ user@host:/backup/data/```
```[rsync](/man/rsync) -avz user@host:/var/www/ /mnt/backup/www/```

Pass SSH options, such as a non-standard port, through `-e`.
```[rsync](/man/rsync) -avz -e "[ssh](/man/ssh) -p 2222" /data/ user@host:/backup/data/```

For a quick one-off copy of a single file, `scp` is simpler.
```[scp](/man/scp) backup.tar.gz user@host:/backup/```

## Incremental Snapshots
With `--link-dest`, `rsync` hard-links unchanged files to a previous backup, so each snapshot looks complete but only uses extra space for files that changed.
```[rsync](/man/rsync) -a --delete --link-dest=/backup/prev /data/ /backup/2026-06-06/```

This gives you browseable, dated snapshots at the storage cost of an incremental backup. Rotate by pointing each new run at the previous day's directory. **rsnapshot** automates exactly this scheme with a config file and retention levels.

## Archiving Backups
A `tar` archive bundles many files into one, ideal for a point-in-time snapshot. Combine with compression to save space.
```[tar](/man/tar) czf backup-$(date +%F).tar.gz /home/user```
```[tar](/man/tar) xzf backup-2026-06-06.tar.gz```

For large datasets, `zstd` compresses much faster than gzip at similar or better ratios.
```[tar](/man/tar) --zstd -cf backup.tar.zst /data```

`tar` supports **incremental** archives: `-g` keeps a snapshot file that records what changed between runs. The first run is a full backup; later runs with the same snapshot file only store changes.
```[tar](/man/tar) czf full.tar.gz -g backup.snar /data```
```[tar](/man/tar) czf incr1.tar.gz -g backup.snar /data```

To restore, extract the full archive first, then each incremental in order.

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

Prune old snapshots with a retention policy so backups do not grow forever. With `borg`, run `compact` afterwards to actually free the space.
```[borg](/man/borg) prune --keep-daily=7 --keep-weekly=4 /mnt/backup/repo```
```[borg](/man/borg) compact /mnt/backup/repo```
```[restic](/man/restic) -r /mnt/backup/repo forget --keep-daily 7 --keep-weekly 4 --prune```

Test a restore by extracting a snapshot to a scratch directory, or mount the repository and browse it.
```[restic](/man/restic) -r /mnt/backup/repo restore latest --target /tmp/restore-test```
```[borg](/man/borg) mount /mnt/backup/repo /mnt/restore```

> If the repository is encrypted, the backup is only as safe as the key and passphrase. Export the key and store it somewhere that is not inside the backup.

## Databases & Live Data
Copying a running database's files mid-write produces a corrupt backup. Dump to a consistent snapshot first, then back up the dump like any other file.
```[mysqldump](/man/mysqldump) --all-databases > mysql-backup.sql```
```[pg_dumpall](/man/pg_dumpall) > postgres-backup.sql```
```[sqlite3](/man/sqlite3) app.db ".backup app-backup.db"```

The same applies to anything that writes constantly (virtual machine disks, mail spools): stop the writer, dump it, or back up from a filesystem snapshot (see below).

## Disk & Partition Imaging
`dd` copies data block by block, making an exact image of a disk or partition. Identify the target device first with `lsblk` and double-check it.
```[lsblk](/man/lsblk)```
```[dd](/man/dd) if=/dev/sda of=/dev/sdb bs=4M status=progress```

Save a partition to a compressed image file instead of another disk.
```[dd](/man/dd) if=/dev/sda1 bs=4M status=progress | [gzip](/man/gzip) > sda1.img.gz```

Restore an image back onto a device.
```[gunzip](/man/gunzip) -c sda1.img.gz | [dd](/man/dd) of=/dev/sda1 bs=4M status=progress```

> `dd` writes wherever you point it with no confirmation. A wrong `of=` value will destroy data instantly. Check the device name twice, then once more. Image only **unmounted** partitions, an image of a filesystem that is changing underneath you is inconsistent.

| Option | Description |
|-----|-------------|
| **if=** | Input file or device |
| **of=** | Output file or device |
| **bs=** | Block size (4M is a good default) |
| **status=progress** | Show transfer progress |
| **conv=noerror,sync** | Keep going past read errors, pad blocks |
| **conv=fsync** | Flush to the device before exiting |
| **count=** | Copy only N blocks |

## Writing Images to USB
To write an installer ISO to a USB stick, `dd` it to the whole device (not a partition). `conv=fsync` makes sure everything is flushed before the command returns.
```[dd](/man/dd) if=distro.iso of=/dev/sdc bs=4M status=progress conv=fsync```

Plain `cp` and `cat` can also stream an image to a device.
```[cp](/man/cp) distro.iso /dev/sdc && [sync](/man/sync)```

Wipe old filesystem signatures from a device before reusing it.
```[wipefs](/man/wipefs) -a /dev/sdc```

## Resilient Imaging & Recovery
When a drive is failing, use `ddrescue` instead of `dd`: it retries bad sectors, works from the easy areas first, and keeps a map file so it can resume later.
```[ddrescue](/man/ddrescue) /dev/sda rescue.img rescue.map```
```[ddrescue](/man/ddrescue) -r3 /dev/sda rescue.img rescue.map```

`partclone` images only the **used** blocks of a filesystem, so it is faster and smaller than a full `dd` of an empty-ish partition. Use `-c` to create an image and `-r` to restore it.
```[partclone](/man/partclone).ext4 -c -s /dev/sda1 -o sda1.img```
```[partclone](/man/partclone).ext4 -r -s sda1.img -o /dev/sda1```

`clonezilla` wraps these tools into a guided disk-cloning environment for bare-metal backups.
```[clonezilla](/man/clonezilla)```

> For repairing a system that no longer boots, recovering deleted files with `testdisk` and `photorec`, and reading SMART health, see the **System Recovery** basics page.

## Filesystem-level Snapshots
Modern filesystems and volume managers can snapshot a live system instantly, giving you a stable, consistent view to back up from.

| System | Create a snapshot |
|-----|-------------|
| **LVM** | `lvcreate -s -n snap -L 5G /dev/vg/lv` |
| **Btrfs** | `btrfs subvolume snapshot / /snap` |
| **ZFS** | `zfs snapshot pool/data@backup` |

Create an LVM snapshot, mount it read-only, and back it up while the system keeps running. Remove the snapshot when done so it stops consuming space.
```[lvcreate](/man/lvcreate) -s -n root_snap -L 5G /dev/vg0/root```
```[mount](/man/mount) -o ro /dev/vg0/root_snap /mnt/snap```
```[rsync](/man/rsync) -a /mnt/snap/ /mnt/backup/root/```
```[umount](/man/umount) /mnt/snap && [lvremove](/man/lvremove) /dev/vg0/root_snap```

Btrfs and ZFS snapshots are even cheaper, create them read-only (`-r`) so the backup source cannot change.
```[btrfs](/man/btrfs) subvolume snapshot -r / /.snapshots/2026-06-06```
```[zfs](/man/zfs) snapshot tank/home@2026-06-06```

`snapper` and `timeshift` automate scheduled Btrfs/LVM snapshots with retention.
```[snapper](/man/snapper) create --description "before upgrade"```
```[timeshift](/man/timeshift) --create```

> Snapshots live on the same disk and are not a backup by themselves. Copy them somewhere else.

## Cloud & Remote Sync
`rclone` syncs files to dozens of cloud providers (S3, Backblaze, Google Drive, and more) after a one-time `rclone config`.
```[rclone](/man/rclone) copy /data remote:backup/data```
```[rclone](/man/rclone) sync /data remote:backup/data --progress```

Check what would change without transferring, verify a finished backup, or mount a remote as a local folder.
```[rclone](/man/rclone) sync /data remote:backup --dry-run```
```[rclone](/man/rclone) check /data remote:backup/data```
```[rclone](/man/rclone) mount remote:backup /mnt/remote```

> Like `rsync --delete`, `rclone sync` makes the destination match the source, including deletions. Use `copy` when you only want to add files.

## Verify & Automate
A backup is only good if it is intact. Record checksums when you make a backup, then verify them on restore.
```[sha256sum](/man/sha256sum) backup.tar.gz > backup.sha256```
```[sha256sum](/man/sha256sum) -c backup.sha256```

Schedule backups so they actually happen. Edit your crontab and add a nightly job.
```[crontab](/man/crontab) -e```
```0 2 * * * [rsync](/man/rsync) -a --delete /data/ /mnt/backup/data/```

> Automate the backup, but verify restores by hand on a schedule. The only proven backup is one you have successfully restored.
