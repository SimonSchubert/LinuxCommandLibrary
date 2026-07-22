# TAGLINE

Convert RPM packages to cpio archives

# TLDR

**Convert** an RPM package to a cpio archive

```rpm2cpio [path/to/file.rpm] > [file.cpio]```

**Extract** files from an RPM package directly

```rpm2cpio [path/to/file.rpm] | cpio -idmv```

**List** contents of an RPM package

```rpm2cpio [path/to/file.rpm] | cpio -t```

# SYNOPSIS

**rpm2cpio** [_file.rpm_]

# PARAMETERS

**file.rpm**
> The RPM package file to convert (reads from stdin if omitted)

# DESCRIPTION

**rpm2cpio** strips the RPM lead, signature, and header sections from a `.rpm` file and writes the embedded cpio payload to standard output. This allows extracting the contents of an RPM package without installing it or relying on the `rpm` database.

The cpio archive is in `newc` format (or `xz`/`lzma`/`zstd`-compressed payload, decompressed transparently by recent rpm builds) and preserves owner, mode, and directory structure as the RPM would install them. It is almost always piped to **cpio** (or **bsdtar**, which understands the same format) for listing or extraction.

# CAVEATS

Does not execute pre/post install scriptlets, run triggers, or update the rpm database. File capabilities, SELinux labels, and file digests stored in the RPM header are **not** applied to the extracted files — only what the cpio payload itself encodes. Extracted files land relative to the current directory; use `cpio -id` (no `-D`) carefully to avoid overwriting host files when paths are absolute.

# INSTALL

```apt: sudo apt install rpm2cpio```

```dnf: sudo dnf install rpm```

```apk: sudo apk add rpm```

```zypper: sudo zypper install rpm```

```brew: brew install rpm2cpio```

```nix: nix profile install nixpkgs#rpm```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[rpm](/man/rpm)(8), [cpio](/man/cpio)(1), [rpmkeys](/man/rpmkeys)(8)
