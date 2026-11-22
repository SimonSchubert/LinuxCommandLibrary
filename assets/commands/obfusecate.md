# TAGLINE

Encrypted, compressed FUSE volume in a single container file

# TLDR

**Create** a thin 1 GB volume and mount it

```obfusecate format my_volume.ofs ~/secure_mount 1G```

**Mount** an existing volume

```obfusecate mount my_volume.ofs ~/secure_mount```

Mount with a **32-byte key file** instead of a passphrase

```obfusecate mount my_volume.ofs ~/secure_mount my_key.key```

**Unmount** and compact free space when zerofree is installed

```obfusecate umount ~/secure_mount```

# SYNOPSIS

**obfusecate** **format** _volume_ _mountpoint_ _size_ [_keyfile_]

**obfusecate** **mount** _volume_ _mountpoint_ [_keyfile_]

**obfusecate** **umount** _mountpoint_

# PARAMETERS

**format** _volume_ _mountpoint_ _size_ [_keyfile_]

> Create _volume_ (the container must not already exist), set its logical size, format an unjournaled ext4 filesystem, and mount it on _mountpoint_. _size_ is a **truncate** size such as **100M** or **1G**.

**mount** _volume_ _mountpoint_ [_keyfile_]

> Mount an existing container.

**umount** _mountpoint_

> Unmount the ext4 layer, optionally zero free blocks, then unmount the bridge directory and remove it.

_keyfile_

> Optional 32-byte file used as the volume key. When it is omitted, **obfusecate** prompts for a passphrase (twice on **format**) and hashes it with SHA-256.

# DESCRIPTION

**obfusecate** is a userspace encrypted block volume. The **obfusecate** command is a wrapper around the **obfusecate_daemon** FUSE process and **fuse2fs**. The daemon exposes the container as a virtual block device in a hidden bridge directory next to the mount point. **fuse2fs** then mounts an ext4 filesystem from that device onto the path you named. No kernel module and no root account are required beyond the usual FUSE setup.

Each 16 KB logical block is compressed, then encrypted and authenticated with ChaCha20-Poly1305. The container is one file, so the host directory does not show the inner file names or sizes. Unwritten blocks stay sparse: a volume created at 1 GB starts near empty and grows as data is written. Deleted space can be reclaimed on **umount** when **zerofree** is installed.

Build it with CMake (C++17, **libfuse3**). The runtime also needs **fuse2fs** and **fusermount3**. **zerofree** is optional. After **cmake --install**, the wrapper is on **PATH** as **obfusecate** and expects to find **obfusecate_daemon** the same way. The license is MIT.

# CAVEATS

**format** refuses to overwrite an existing container file. Pick a new path or remove the old file first.

The passphrase is reduced with SHA-256 to 32 bytes. A key file is used as-is; it should be 32 bytes of key material, mode **600**.

**umount** runs **zerofree** only when that program is on **PATH**. Without it, unused blocks are left in the container.

Throughput is limited by FUSE, compression, and software encryption. This is a portable vault, not a full-disk encryption setup. **cryptsetup** and **gocryptfs** solve different problems: block-device encryption that needs root, and a file-level overlay that still shows the directory tree.

The bridge directory is a hidden sibling of the mount point: a leading dot, the mount directory's name, and the suffix `_bridge`. Do not delete it while the volume is mounted.

# SEE ALSO

[gocryptfs](/man/gocryptfs)(1), [encfs](/man/encfs)(1), [cryptsetup](/man/cryptsetup)(1), [veracrypt](/man/veracrypt)(1)

# RESOURCES

```[Source code](https://github.com/tgaloppo/obfusecate)```

<!-- verified: 2026-11-22 -->
