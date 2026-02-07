# TAGLINE

View bzip2 compressed files with more pager

# TLDR

**View** compressed file

```bzmore [file.txt.bz2]```

# SYNOPSIS

**bzmore** [_file_...]

# DESCRIPTION

**bzmore** is a filter for viewing bzip2-compressed files page by page using the more pager. It decompresses files and displays them with basic paging functionality.

The tool is similar to bzless but uses the simpler more pager.

# FEATURES

- Page-by-page viewing
- Basic search
- Original file preserved
- Multiple file support

# KEYBINDINGS

- **Space** - Next page
- **/pattern** - Search
- **q** - Quit
- **h** - Help

# WORKFLOW

```bash
# View compressed file
bzmore logfile.bz2

# View multiple files
bzmore *.bz2
```

# CAVEATS

Less feature-rich than bzless. No backward navigation. Limited search capabilities. Consider using bzless instead for better functionality.

# HISTORY

**bzmore** has been part of bzip2 utilities since **1996**, modeled after zmore.

# SEE ALSO

[more](/man/more)(1), [bzless](/man/bzless)(1), [bzcat](/man/bzcat)(1)
