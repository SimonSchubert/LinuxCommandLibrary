# TAGLINE

copy container images between registries

# TLDR

**Copy an image** between registries

```crane copy [source_image] [destination_image]```

**Copy with all tags**

```crane copy --all-tags [source_repo] [destination_repo]```

**Copy specific platform**

```crane copy --platform [linux/amd64] [source] [destination]```

# SYNOPSIS

**crane** **copy** [_options_] _source_ _destination_

# PARAMETERS

**-a**, **--all-tags**
> Copy all tags from source repository.

**--platform** _platform_
> Copy only specific platform (e.g., linux/amd64).

**-n**, **--no-clobber**
> Don't overwrite existing tags.

# DESCRIPTION

**crane copy** copies container images between registries without pulling to local storage. This is more efficient than docker pull/push as it transfers directly between registries.

# SEE ALSO

[crane](/man/crane)(1), [crane-cp](/man/crane-cp)(1), [skopeo](/man/skopeo)(1)
