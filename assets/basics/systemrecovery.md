# System Recovery

## Recovery Strategy
When a machine will not boot or behaves badly, work from the outside in: get a shell, see the disk, then repair the smallest broken thing. Most recoveries follow the same arc: boot rescue media, mount or `chroot` into the install, fix the bootloader, filesystem, or config, then reboot.

| Symptom | Reach for |
|-----|-------------|
| **No bootloader** | `[grub-install](/man/grub-install)` |
| **Kernel can't find root device** | `[update-initramfs](/man/update-initramfs)` |
| **Boot drops to emergency mode** | `[findmnt](/man/findmnt)` |
| **Lost root password** | `[passwd](/man/passwd)` |
| **Dirty filesystem** | `[fsck](/man/fsck)` |
| **Broken packages** | `[dpkg](/man/dpkg)` |
| **Failing disk** | `[smartctl](/man/smartctl)` |
| **Deleted files** | `[testdisk](/man/testdisk)` |

> Before you change anything on a failing disk, image it first. See the **Backup & Imaging** basics page for `ddrescue` and `dd`.

## Boot from Rescue Media
Almost every repair starts from a second environment, so a broken install is not running while you fix it. Boot a live USB (any distribution's installer works) or your distribution's dedicated rescue image, then drop to a terminal.

Write a live image to a USB stick from another machine.
```[dd](/man/dd) if=linux.iso of=/dev/sdc bs=4M status=progress conv=fsync```

Many distributions also ship a **rescue** entry in GRUB, and systemd offers built-in recovery shells you can request from the boot menu (see *Rescue & Emergency Mode* below). Use a live USB when the bootloader itself is gone.

> Match the live system's architecture and, ideally, its toolset to the broken install. An Arch live USB has `mkinitcpio`; a Debian one has `update-initramfs`.

## See the Disks
Before mounting anything, identify the partitions. `lsblk` shows the block-device tree, and `blkid` prints filesystem types and UUIDs so you mount the right thing.
```[lsblk](/man/lsblk) -f```
```[blkid](/man/blkid)```
```[fdisk](/man/fdisk) -l```

`findmnt` shows what is already mounted, useful when a live system auto-mounts disks.
```[findmnt](/man/findmnt)```

| Command | Shows |
|-----|-------------|
| **lsblk -f** | Devices, filesystems, labels, mountpoints |
| **blkid** | UUID and type per partition |
| **fdisk -l** | Partition tables and sizes |
| **findmnt** | Current mount tree |

## Activate LVM & Encrypted Volumes
If the root filesystem lives on LVM or LUKS, the live system will not see it until you bring it up. Unlock an encrypted partition first, then scan for volume groups.
```[cryptsetup](/man/cryptsetup) open /dev/sda2 cryptroot```
```[vgscan](/man/vgscan)```
```[vgchange](/man/vgchange) -ay```
```[lvscan](/man/lvscan)```

After this, logical volumes appear under `/dev/mapper/` and the unlocked LUKS device under `/dev/mapper/cryptroot`, ready to mount.

## Mount the Broken System
Mount the root partition somewhere, then layer `/boot` (and the EFI partition) on top so paths match the real system.
```[mount](/man/mount) /dev/sda2 /mnt```
```[mount](/man/mount) /dev/sda1 /mnt/boot/efi```

If you only need to copy data off, stop here and grab the files. If the root filesystem refuses to mount cleanly, run a check on it first (see *Filesystem Repair*).

> Mount read-only with `mount -o ro` when you only want to rescue data from a questionable disk, so you cannot make things worse.

## chroot into the System
To run the broken system's own tools (its `grub`, its package manager, its `passwd`), `chroot` into it. First bind-mount the kernel's pseudo-filesystems so those tools work, including the EFI variables for UEFI bootloader fixes.
```[mount](/man/mount) --rbind /dev /mnt/dev```
```[mount](/man/mount) --rbind /proc /mnt/proc```
```[mount](/man/mount) --rbind /sys /mnt/sys```
```[mount](/man/mount) --rbind /run /mnt/run```
```[chroot](/man/chroot) /mnt /bin/bash```

On Arch and its derivatives, `arch-chroot` does all of this in one step.
```[arch-chroot](/man/arch-chroot) /mnt```

When you finish, `exit` the chroot and unmount everything in reverse, recursively.
```[umount](/man/umount) -R /mnt```

> Without `/dev`, `/proc`, and `/sys` mounted, tools like `grub-install` and `update-initramfs` fail in confusing ways. The bind mounts are not optional. After each `--rbind`, run `mount --make-rslave /mnt/dev` (and the same for the others) so the later `umount -R /mnt` cannot propagate back and unmount the live system's own `/dev` and `/sys`.

## Repair the Bootloader
A missing or broken bootloader leaves you at a `grub>` prompt or with no menu at all. From inside the chroot, reinstall GRUB to the disk, then regenerate its config.

For a legacy BIOS system, install to the whole disk (not a partition).
```[grub-install](/man/grub-install) /dev/sda```

For a UEFI system, install to the EFI partition with the EFI target.
```[grub-install](/man/grub-install) --target=x86_64-efi --efi-directory=/boot/efi --bootloader-id=GRUB```

Then rebuild the menu so it lists the installed kernels. Debian and Ubuntu wrap this as `update-grub`.
```[grub-mkconfig](/man/grub-mkconfig) -o /boot/grub/grub.cfg```
```[update-grub](/man/update-grub)```

Inspect or clean up UEFI boot entries with `efibootmgr` when the firmware boots the wrong thing.
```[efibootmgr](/man/efibootmgr) -v```

## Rebuild the initramfs
If a kernel update was interrupted or the early-boot image is broken (a "cannot find root device" or kernel panic on boot), regenerate the initramfs from inside the chroot. The command depends on the distribution.

| Distribution | Rebuild command |
|-----|-------------|
| **Debian / Ubuntu** | `update-initramfs -u -k all` |
| **Arch** | `mkinitcpio -P` |
| **Fedora / RHEL** | `dracut -f --regenerate-all` |

```[update-initramfs](/man/update-initramfs) -u -k all```
```[mkinitcpio](/man/mkinitcpio) -P```
```[dracut](/man/dracut) -f --regenerate-all```

## Rescue & Emergency Mode
You do not always need a live USB. systemd ships two recovery targets you can request at the GRUB menu: **rescue** (single-user, most services stopped) and **emergency** (a bare shell, root mounted read-only, almost nothing else).

At the menu, highlight the entry, press `e` to edit, append to the `linux` line, then press `Ctrl-X` (or `F10`) to boot it:
```systemd.unit=rescue.target```
```systemd.unit=emergency.target```

To bypass init entirely and get a root shell with no password, append this instead, then remount the root filesystem writable.
```init=/bin/bash```
```[mount](/man/mount) -o remount,rw /```

From an already-running system, you can switch into these modes directly, and resume a normal boot once the problem is fixed.
```[systemctl](/man/systemctl) rescue```
```[systemctl](/man/systemctl) emergency```
```[systemctl](/man/systemctl) default```

> After `init=/bin/bash`, the normal shutdown path is gone. Run `sync` and reboot with the magic SysRq keys or `mount -o remount,ro /` before a hard reset, so you do not corrupt the filesystem.

## Reset a Forgotten Root Password
The simplest path is from a chroot: mount the system, `chroot` in, and just set the password.
```[chroot](/man/chroot) /mnt /bin/bash```
```[passwd](/man/passwd) root```

Without rescue media, use the `init=/bin/bash` trick above, remount root read-write, change the password, then reboot.
```[mount](/man/mount) -o remount,rw /```
```[passwd](/man/passwd) root```
```[exec](/man/exec) /sbin/init```

> On SELinux systems (Fedora, RHEL), run `touch /.autorelabel` after changing the password this way. Otherwise the rewritten `/etc/shadow` keeps a wrong security label and can lock you out again on the next boot.

## Filesystem Repair
A dirty or corrupt filesystem can block boot. **Always check an unmounted filesystem**, never the live root. Boot rescue media, leave the partition unmounted, then run the right checker.

For ext2/3/4, `fsck` (or `e2fsck`) replays the journal and fixes structure. `-f` forces a full check, `-y` answers yes to every prompt.
```[fsck](/man/fsck) -f /dev/sda2```
```[e2fsck](/man/e2fsck) -fy /dev/sda2```

XFS uses its own repair tool, which needs the filesystem unmounted.
```[xfs_repair](/man/xfs_repair) /dev/sda2```

Btrfs checks read-only by default; `--repair` is a genuine last resort that can make damage worse.
```[btrfs](/man/btrfs) check /dev/sda2```
```[btrfs](/man/btrfs) check --repair /dev/sda2```

| Filesystem | Check / repair |
|-----|-------------|
| **ext2/3/4** | `fsck -f`, `e2fsck -fy` |
| **XFS** | `xfs_repair` |
| **Btrfs** | `btrfs check`, `--repair` (last resort) |
| **FAT / exFAT** | `fsck.vfat -a`, `fsck.exfat` |

> `fsck` on a mounted, writable filesystem will corrupt it. If you must check the root device, do it from rescue media or before it is remounted read-write.

## Fix a Broken /etc/fstab
A typo or a missing device in `/etc/fstab` drops the boot into emergency mode. From the emergency shell, remount root writable and fix or comment out the bad line.
```[mount](/man/mount) -o remount,rw /```

Edit `/etc/fstab`, comment out the offending mount, or add the `nofail` option so a missing device no longer blocks boot.
```UUID=... /data ext4 defaults,nofail 0 2```

Verify the file parses before rebooting; `mount -a` tries every entry and reports failures.
```[mount](/man/mount) -a```
```[findmnt](/man/findmnt) --verify```

> Match devices by UUID (from `blkid`), not by `/dev/sdX`, which can change between boots and is a common cause of fstab boot failures.

## Repair Broken Package State
An interrupted upgrade can leave packages half-configured and the system unbootable or unusable. Run these from a chroot if the system will not boot, or directly if it limps to a shell.

On Debian and Ubuntu, finish pending configuration and resolve broken dependencies.
```[dpkg](/man/dpkg) --configure -a```
```[apt](/man/apt) --fix-broken install```

On Fedora and RHEL, check and re-synchronize the package set.
```[dnf](/man/dnf) check```
```[dnf](/man/dnf) distro-sync```

Rebuild a corrupt RPM database if `rpm` itself errors out.
```[rpm](/man/rpm) --rebuilddb```

## Diagnose with Logs
Before guessing, read what the system recorded. `journalctl` shows the boot log; `-x` adds explanations, `-b` selects a boot, and `-b -1` shows the **previous** (failed) boot.
```[journalctl](/man/journalctl) -xb```
```[journalctl](/man/journalctl) -b -1 -p err```

From a live USB, point `journalctl` at the broken system's logs instead of the live one's.
```[journalctl](/man/journalctl) -D /mnt/var/log/journal -xb```

The kernel ring buffer catches hardware and driver errors that crash early.
```[dmesg](/man/dmesg) --level=err,warn```

## Check Disk Health
If the same errors keep coming back, the drive may be dying. `smartctl` reads the disk's own SMART data, the fastest way to confirm hardware failure.
```[smartctl](/man/smartctl) -H /dev/sda```
```[smartctl](/man/smartctl) -a /dev/sda```
```[smartctl](/man/smartctl) -t short /dev/sda```

`badblocks` scans the surface for unreadable sectors. Use the read-only mode on a disk with data on it.
```[badblocks](/man/badblocks) -sv /dev/sda```

> A failing **Reallocated_Sector_Ct** or **Current_Pending_Sector** in `smartctl -a` means: stop, image the disk with `ddrescue`, and replace it. Repairs on dying hardware only buy minutes.

## Recover Deleted Files & Partitions
When the problem is lost data rather than a broken boot, work on a **copy** of the disk, never the original. `testdisk` rebuilds damaged partition tables and recovers whole partitions.
```[testdisk](/man/testdisk) /dev/sda```

`photorec` ignores the filesystem and carves files back by their signatures, which works even on a reformatted disk.
```[photorec](/man/photorec) /dev/sda```

For ext3/ext4, `extundelete` can recover recently deleted files using the journal.
```[extundelete](/man/extundelete) /dev/sda2 --restore-all```

> The moment you realize files were deleted, unmount the filesystem or power off. Continued writes overwrite the very blocks you are trying to recover.

## Last Resort: Rescue, then Rebuild
If the install is too broken to repair, salvage what you can and start fresh. Image the failing disk before it gets worse, then mount the image to extract files at your own pace.
```[ddrescue](/man/ddrescue) /dev/sda rescue.img rescue.map```

A whole-disk image holds a partition table, not a single filesystem, so attach it read-only with `losetup -P` to expose its partitions, then mount the one you need.
```[losetup](/man/losetup) -rfP --show rescue.img```
```[mount](/man/mount) -o ro /dev/loop0p2 /mnt```

Copy the data you need off the image, reinstall the OS, then restore from backups. A clean reinstall is often faster and safer than chasing a deeply corrupted system.

> Every recovery is easier with a current backup and a tested restore. The work you do here is the price of not having one: see the **Backup & Imaging** page.
