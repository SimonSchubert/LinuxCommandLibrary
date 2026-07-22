# TAGLINE

Recover data from damaged bzip2 files

# TLDR

**Recover** data from damaged file

```bzip2recover [damaged.bz2]```

# SYNOPSIS

**bzip2recover** _file.bz2_

# DESCRIPTION

**bzip2recover** attempts to recover data from damaged bzip2 compressed files. It works by extracting intact blocks from corrupted .bz2 files, potentially recovering some or most of the data.

The tool is useful when bzip2 files become corrupted and normal decompression fails.

# OPERATION

The tool:
1. Scans the damaged **.bz2** file for valid block boundaries.
2. Writes each intact block to a separate file named **rec0000N**_input_**.bz2** (e.g. **rec00001damaged.bz2**, **rec00002damaged.bz2**).
3. Each recovered single-block file can then be decompressed independently with **bunzip2**.

# WORKFLOW

```bash
# Attempt recovery
bzip2recover damaged.bz2

# Creates: rec00001damaged.bz2, rec00002damaged.bz2, ...

# Decompress each recovered block
bunzip2 rec*damaged.bz2

# Concatenate the decompressed blocks in order
cat rec*damaged > recovered.txt
```

# FEATURES

- Block-level recovery
- Does not modify the original file
- Works on partially corrupted files
- Produces one **.bz2** file per intact block

# CAVEATS

Cannot recover data inside a corrupted block — only whole blocks bounded by intact 48-bit block-start/end markers are saved. The first block is often unrecoverable because its leading bits sit in the file header. Effective only on files compressed with a block size larger than the default (recovery requires multiple blocks). Recovered blocks must be decompressed and concatenated manually. Backups are far more reliable than recovery.

# HISTORY

**bzip2recover** has been included with bzip2 since version 1.0 in **2000** to help recover from corruption.

# INSTALL

```apt: sudo apt install bzip2```

```dnf: sudo dnf install bzip2```

```pacman: sudo pacman -S bzip2```

```apk: sudo apk add bzip2```

```zypper: sudo zypper install bzip2```

```brew: brew install bzip2```

```nix: nix profile install nixpkgs#bzip2```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[bzip2](/man/bzip2)(1), [bunzip2](/man/bunzip2)(1), [ddrescue](/man/ddrescue)(1)
