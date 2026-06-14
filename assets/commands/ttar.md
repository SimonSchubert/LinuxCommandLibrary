# TAGLINE

Tiny freestanding tar archiver written in C

# TLDR

**Create an archive** from files

```ttar c [archive.tar] [file1] [file2]```

**Extract** an archive

```ttar x [archive.tar]```

# SYNOPSIS

**ttar** **c** _archive.tar_ _files..._

**ttar** **x** _archive.tar_

# DESCRIPTION

**ttar** (tiny tar) is a minimal tar archiver written in freestanding C. It uses only raw system calls, with no libc, no external libraries, and no other dependencies, producing a very small static binary (about 2.4 KB on arm64). It targets multiple architectures including arm64, arm-v7, mips, riscv, x86, and i386.

The tool supports just two operations: creating an uncompressed tar archive from a list of files, and extracting an existing tar archive. It is aimed at minimal, embedded, or bootstrap environments where a full **tar** implementation is unavailable or too large.

# PARAMETERS

**c** _archive.tar_ _files..._
> Create _archive.tar_ containing the listed files.

**x** _archive.tar_
> Extract the contents of _archive.tar_ into the current directory.

# CAVEATS

The mode must be a single **c** or **x** as the first argument; any other value exits with an error. ttar does not compress archives and does not provide listing, appending, or filtering options found in full tar implementations. Use a dedicated compressor such as **gzip** on the resulting archive if compression is needed.

# HISTORY

**ttar** was released as a demonstration of a libc-free, syscall-only archiver in pure C, emphasizing an extremely small binary footprint. It is distributed under the GPL-3.0 license.

# SEE ALSO

[tar](/man/tar)(1), [cpio](/man/cpio)(1), [pax](/man/pax)(1), [ar](/man/ar)(1), [gzip](/man/gzip)(1)

# RESOURCES

```[Source code](https://github.com/Ferki-git-creator/ttar-tiny-tar-archivist)```

<!-- verified: 2026-06-14 -->
