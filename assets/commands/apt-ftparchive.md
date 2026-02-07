# TAGLINE

Generate index files for APT repositories.

# TLDR

**Generate** Packages file

```apt-ftparchive packages [pool/] > [Packages]```

Generate **Sources** file

```apt-ftparchive sources [pool/] > [Sources]```

Generate **Release** file

```apt-ftparchive release [dists/stable] > [Release]```

Generate with **configuration file**

```apt-ftparchive generate [config.conf]```

# SYNOPSIS

**apt-ftparchive** [_options_] _command_ [_arguments_]

# DESCRIPTION

**apt-ftparchive** generates index files for APT repositories. It creates Packages, Sources, Contents, and Release files from a directory of .deb and .dsc files.

This tool is essential for creating and maintaining local APT repositories or mirrors.

# PARAMETERS

**packages** _dir_
> Generate Packages file from directory

**sources** _dir_
> Generate Sources file

**contents** _dir_
> Generate Contents file

**release** _dir_
> Generate Release file

**generate** _config_
> Generate files per configuration

**clean** _config_
> Clean up database files

**-c** _file_
> Configuration file

**-d** _db_
> Database directory

**--md5**, **--sha1**, **--sha256**, **--sha512**
> Hash algorithms to generate

# CAVEATS

Release files should be signed with gpg for secure repositories. Large repositories may take significant time to index. Database caching improves regeneration speed.

# HISTORY

**apt-ftparchive** is part of APT, designed for repository maintainers to create the index files that APT clients use to find and download packages.

# SEE ALSO

[apt](/man/apt)(8), [reprepro](/man/reprepro)(1), [dpkg-scanpackages](/man/dpkg-scanpackages)(1)
