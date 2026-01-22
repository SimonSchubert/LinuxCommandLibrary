# TLDR

**Initialize** a basic repository

```createrepo [path/to/directory]```

Initialize with **exclusions** and verbose output

```createrepo -v -x [test_*.rpm] [path/to/directory]```

Use **SHA1 checksum** and skip symlinks

```createrepo -S -s sha1 [path/to/directory]```

# SYNOPSIS

**createrepo** [_options_] _directory_

# DESCRIPTION

**createrepo** initializes an RPM repository by creating the metadata files (XML and SQLite) required by yum/dnf. It scans a directory of RPM packages and generates the repodata subdirectory.

Used to create local or custom RPM repositories for package distribution.

# PARAMETERS

**-v, --verbose**
> Verbose output

**-x, --excludes** _pattern_
> Exclude packages matching pattern

**-s, --checksum** _type_
> Checksum algorithm (sha1, sha256, etc.)

**-S, --skip-symlinks**
> Ignore symbolic links

**-u, --baseurl** _url_
> Base URL for the repository

**--update**
> Update existing repository (faster)

# CAVEATS

Must be rerun after adding/removing packages. For large repositories, --update is faster than full regeneration. Consider using createrepo_c for better performance.

# SEE ALSO

[yum](/man/yum)(8), [dnf](/man/dnf)(8), [rpm](/man/rpm)(8)
