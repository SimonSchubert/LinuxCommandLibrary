# TAGLINE

Consolidate duplicate files by replacing them with hard links

# TLDR

Hardlink duplicate files in a directory (dry-run first)

```hardlink --dry-run /path/to/directory```

Hardlink duplicates in one or more directories

```hardlink /path/to/dir1 /path/to/dir2```

Hardlink with verbose output

```hardlink --verbose /path/to/directory```

Only consider files larger than a minimum size

```hardlink --minimum-size 1M /path/to/directory```

# SYNOPSIS

**hardlink** [_options_] _directory_...

# PARAMETERS

**-n**, **--dry-run**  
> Do not actually link files, just print what would be done

**-v**, **--verbose**  
> Print more information about what is being done

**-s**, **--minimum-size** _size_  
> Only hardlink files larger than _size_ (suffixes K, M, G supported)

**-x**, **--exclude** _pattern_  
> Skip files matching the given glob pattern (repeatable)

**-i**, **--include** _pattern_  
> Only consider files matching the given glob pattern

**-f**, **--force**  
> Link files even across different filesystems (dangerous)

# DESCRIPTION

**hardlink** finds identical files in the given directories and replaces all but one copy with hard links to the remaining file. This saves disk space when the same content exists in multiple places (common with backups, package caches, build artifacts, etc.).

The tool compares file contents (not just names or sizes) before linking. It is safe by default: it will not cross filesystem boundaries and will refuse to link files that are not identical.

Hard links are directory entries pointing to the same inode. Deleting one name does not affect the others; the data is only removed when the last link is deleted. This makes hardlink particularly useful for deduplicating large static datasets.

# CAVEATS

- Hard links can only be created on the same filesystem.
- The original file permissions and ownership are preserved on the remaining copy.
- Running hardlink on active build or database directories can cause surprising results if files are being modified during the scan.
- Some backup tools and version control systems do not expect hard links and may behave unexpectedly.

# SEE ALSO

[cp](cp)(1), [ln](ln)(1), [find](find)(1), [fdupes](fdupes)(1), [rdfind](rdfind)(1)