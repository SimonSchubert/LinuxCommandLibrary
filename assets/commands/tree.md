# TAGLINE

Display directory contents in tree format

# TLDR

**Display directory tree**

```tree```

**Show tree for specific directory**

```tree [path/to/directory]```

**Include hidden files**

```tree -a```

**Show only directories**

```tree -d```

**Limit depth** of tree

```tree -L [2]```

**Show file sizes**

```tree -s```

**Show human-readable sizes**

```tree -h```

**Output in JSON format**

```tree -J```

**Exclude patterns**

```tree -I "[pattern|pattern2]"```

**Show full path** for each file

```tree -f```

**Sort by modification time**, newest first

```tree -t -r```

**Show directory sizes and respect .gitignore**

```tree --du --gitignore```

# SYNOPSIS

**tree** [_options_] [_directory_...]

# PARAMETERS

**-a**
> Show all files including hidden

**-d**
> List directories only

**-L** _level_
> Limit depth to level

**-f**
> Print full path prefix

**-s**
> Print size of each file

**-h**
> Print sizes in human-readable format

**-D**
> Print last modification date

**-p**
> Print file permissions

**-u**
> Print username

**-g**
> Print group name

**-I** _pattern_
> Exclude files matching pattern

**-P** _pattern_
> List only files matching pattern

**--dirsfirst**
> List directories before files

**-C**
> Colorize output

**-n**
> Turn off colorization

**-r**
> Sort output in reverse order

**-t**
> Sort by last modification time

**-o** _filename_
> Send output to filename

**--du**
> Show cumulative directory sizes

**--prune**
> Prune empty directories from output

**--gitignore**
> Use .gitignore files for filtering

**--noreport**
> Omit file and directory count at end of listing

**--filelimit** _N_
> Do not descend directories with more than N entries

**-H** _baseHREF_
> Output HTML with base URL

**-J**
> Output JSON

**-X**
> Output XML

# DESCRIPTION

**tree** displays the contents of directories in a tree-like format, showing the hierarchical relationship between files and subdirectories visually.

The default output uses ASCII or Unicode box-drawing characters to represent the tree structure. Colorization helps distinguish file types (directories, executables, symlinks, etc.).

Various output formats are supported for integration with other tools: JSON (**-J**) for programmatic parsing, XML (**-X**) for structured data, and HTML (**-H**) for web display.

Filtering with **-I** (exclude) and **-P** (include) uses shell glob patterns, supporting wildcards like \* and ?.

# CAVEATS

Large directories can produce overwhelming output. Use **-L** to limit depth or **-d** for directories only when exploring unfamiliar structures.

Tree does not follow symbolic links by default if they would cause recursion. Use **-l** to follow all symlinks.

Using **--prune** and **--du** causes tree to accumulate the entire tree in memory before output, which may be slow for very large directory trees.

# SEE ALSO

[ls](/man/ls)(1), [find](/man/find)(1), [du](/man/du)(1), [exa](/man/exa)(1), [eza](/man/eza)(1), [lsd](/man/lsd)(1)
