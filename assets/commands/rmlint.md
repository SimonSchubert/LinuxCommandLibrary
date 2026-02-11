# TAGLINE

Find duplicate files and filesystem lint

# TLDR

**Find duplicates in directory**

```rmlint [/path/to/directory]```

**Find duplicates and generate removal script**

```rmlint [/path/to/directory]```

**Find only duplicate files** (not empty files/dirs)

```rmlint -T df [/path/to/directory]```

**Keep first found duplicate**

```rmlint -k [/path/to/directory]```

**Compare two directories** (keep originals in first)

```rmlint [/path/to/originals] // [/path/to/duplicates]```

**Find empty files and directories**

```rmlint -T ef,ed [/path/to/directory]```

**Dry run** (output only)

```rmlint --dry-run [/path/to/directory]```

**JSON output**

```rmlint -o json [/path/to/directory]```

# SYNOPSIS

**rmlint** [_-T types_] [_-k_] [_-o output_] [_options_] _paths_ [**//** _paths_]

# PARAMETERS

**-T**, **--types** _TYPES_
> Find types: df (duplicates), ef (empty files), ed (empty dirs).

**-k**, **--keep-all-tagged**
> Keep files in tagged (first) paths.

**-m**, **--must-match-tagged**
> Require match in tagged path.

**-o**, **--output** _FMT_
> Output format: sh, csv, json, py.

**-c**, **--config** _FMT:KEY=VALUE_
> Configure output handler.

**-s**, **--size** _RANGE_
> Filter by file size.

**-d**, **--max-depth** _N_
> Maximum directory depth.

**--dry-run**
> Don't write output files.

**-g**, **--progress**
> Show progress bar.

**-p**, **--paranoid**
> Byte-by-byte comparison.

**-S** _CRITERIA_, **--sortcriteria** _CRITERIA_
> Sorting for original selection.

**-n**, **--newer-than-stamp** _FILE_
> Only files newer than file.

**-r**, **--hidden**
> Include hidden files.

**-f**, **--followlinks**
> Follow symbolic links.

# DESCRIPTION

**rmlint** finds duplicate files, empty files, broken symlinks, and other lint. It generates scripts to remove or manage found items.

Duplicate detection uses progressive matching: size first, then partial hashes, finally full hashes or paranoid byte comparison. This minimizes I/O for large collections.

The double-slash (//) separator defines original vs duplicate paths. Files in paths before // are preferred originals; those after are marked as duplicates. This enables controlled cleanup of backup or mirror directories.

Output includes a shell script (rmlint.sh) with removal commands. The script is cautious by default, requiring confirmation and keeping originals. JSON and CSV outputs enable custom processing.

Sorting criteria (-S) determine which duplicate is kept: by age, path depth, basename length, or alphabetically. Multiple criteria combine for fine-grained control.

Additional lint types include: empty directories, broken symlinks, files with bad user/group, and non-stripped binaries.

# CAVEATS

Hash-based detection has theoretical collision risk. Large filesystems need significant memory for tracking. Follow-symlink mode can expand search dramatically. Removal scripts should be reviewed before execution. Some filesystems don't track modification time accurately.

# HISTORY

**rmlint** was created by **Christopher Pahl** (SeeSpotRun) around **2012** as a fast, modern duplicate finder. Written in C, it replaced slower Python predecessors. The project emphasizes safety (generating review-able scripts) and performance (parallel hashing, incremental matching).

# SEE ALSO

[fdupes](/man/fdupes)(1), [jdupes](/man/jdupes)(1), [duperemove](/man/duperemove)(1), [rdfind](/man/rdfind)(1)
