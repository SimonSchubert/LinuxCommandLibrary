# TAGLINE

Data-free FUSE filesystem backed by π

# TLDR

**Mount a πfs filesystem**

```pifs -o mdd=[/path/to/metadata] [mountpoint]```

**Build from source**

```./autogen.sh && ./configure && make && sudo make install```

# SYNOPSIS

**pifs** **-o** _mdd=metadata-directory_ [_mountpoint_]

# PARAMETERS

**-o mdd=**_path_
> Directory where πfs stores metadata (filenames and byte offsets in π).

_mountpoint_
> Directory where the filesystem is mounted.

# DESCRIPTION

**pifs** (πfs) is a FUSE userspace filesystem that stores file data by locating each byte's position within the digits of π rather than on disk. Because π is conjectured to be a normal number, every finite byte sequence is theoretically present somewhere in its expansion; πfs records only the index and length needed to retrieve each byte.

Files are split into individual bytes, each looked up in π using the Bailey–Borwein–Plouffe formula. Metadata (paths and offsets) is written to the directory given by **mdd=**. The filesystem is largely a proof-of-concept: storing even small files is extremely slow because locating arbitrary digit sequences in π is computationally expensive.

Requires **libfuse** and a C build toolchain. Install build dependencies on Debian-based systems with **autotools-dev**, **automake**, and **libfuse-dev**.

# CAVEATS

Lookup performance is impractical for real workloads; the project README notes that storing a 400-line text file can take several minutes. If metadata is lost, file locations cannot be recovered even though the data still exists in π. For a newer related project, see inferencefs.

# HISTORY

πfs was created by Philip L. as a humorous exploration of the idea that all possible data already exists within π, inspired by a 2001 observation that a normal π would contain every finite file. The repository has been widely shared since its initial release.

# SEE ALSO

[fusermount](/man/fusermount)(1), [mount](/man/mount)(8), [inferencefs](https://github.com/philipl/inferencefs)

# RESOURCES

```[Source code](https://github.com/philipl/pifs)```

<!-- verified: 2026-06-11 -->