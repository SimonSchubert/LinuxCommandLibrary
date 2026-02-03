# TLDR

**Calculate package hash**

```pip hash [package.whl]```

**Calculate SHA256 hash**

```pip hash -a sha256 [package.tar.gz]```

**Calculate multiple hashes**

```pip hash -a sha256 -a sha384 [package.whl]```

# SYNOPSIS

**pip** **hash** [_options_] _files_...

# PARAMETERS

**-a**, **--algorithm** _algo_
> Hash algorithm (sha256, sha384, sha512).

# DESCRIPTION

**pip hash** computes hash digests of package archives. Outputs hashes in a format suitable for requirements files with hash-checking mode. Supports SHA256, SHA384, and SHA512 algorithms.

# SEE ALSO

[pip](/man/pip)(1), [pip-download](/man/pip-download)(1)

