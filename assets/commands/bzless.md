# TAGLINE

View bzip2 compressed files with less pager

# TLDR

**View** compressed file

```bzless [file.txt.bz2]```

# SYNOPSIS

**bzless** [_file_...]

# DESCRIPTION

**bzless** is a filter for viewing bzip2-compressed files using the less pager. It decompresses files on-the-fly and provides the full functionality of less for navigation, searching, and viewing.

The tool combines bzcat with less for comfortable viewing of compressed files.

# FEATURES

- Full less navigation
- Search within compressed files
- No disk decompression needed
- Multiple file support
- Original file preserved

# LESS KEYBINDINGS

- **Space/f** - Page down
- **b** - Page up
- **/pattern** - Search forward
- **?pattern** - Search backward
- **n** - Next match
- **q** - Quit

# WORKFLOW

```bash
# View compressed log
bzless logfile.bz2

# View multiple files
bzless file1.bz2 file2.bz2

# Search within
bzless logfile.bz2
# Then: /error
```

# CAVEATS

Decompresses entire file for navigation. Cannot edit files. Slower than viewing uncompressed files. Large compressed files may be slow to load.

# HISTORY

**bzless** has been part of bzip2 utilities since **1996**, modeled after zless for gzip files.

# SEE ALSO

[less](/man/less)(1), [bzcat](/man/bzcat)(1), [bzmore](/man/bzmore)(1), [zless](/man/zless)(1)
