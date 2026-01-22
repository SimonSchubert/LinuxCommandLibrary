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
1. Scans the damaged .bz2 file for valid block boundaries
2. Extracts each intact block to separate files (rec00001.bz2, rec00002.bz2, etc.)
3. Each recovered file can be decompressed independently

# WORKFLOW

```bash
# Attempt recovery
bzip2recover damaged.bz2

# This creates: rec00001damaged.bz2, rec00002damaged.bz2, etc.

# Decompress recovered blocks
bunzip2 rec*damaged.bz2

# Manually combine recovered data if needed
cat rec*damaged > recovered.txt
```

# FEATURES

- Block-level recovery
- No modification of original file
- Works with partially corrupted files
- Creates separate files per block

# CAVEATS

Cannot recover completely destroyed data. Recovery depends on block boundaries being intact. May only recover partial file. Recovered blocks need manual combination. Not guaranteed to work. Prevention (backups) better than recovery.

# HISTORY

**bzip2recover** has been included with bzip2 since version 1.0 in **2000** to help recover from corruption.

# SEE ALSO

[bzip2](/man/bzip2)(1), [bunzip2](/man/bunzip2)(1), [ddrescue](/man/ddrescue)(1)
