# TAGLINE

Load, replace, and manage AppArmor security profiles.

# TLDR

**Load** a profile into the kernel

```sudo apparmor_parser -a [profile_file]```

**Replace** an existing profile

```sudo apparmor_parser -r [profile_file]```

**Remove** a profile from the kernel

```sudo apparmor_parser -R [profile_name]```

Load a profile in **complain mode**

```sudo apparmor_parser -C -r [path/to/profile]```

**Preprocess** a profile and write binary cache to file

```apparmor_parser -p -o [path/to/output.cache] -Q [path/to/profile]```

Replace a profile while **skipping cache** reads

```sudo apparmor_parser -r -T [path/to/profile]```

# SYNOPSIS

**apparmor_parser** [_options_] _command_ [_profiles_...]

# DESCRIPTION

**apparmor_parser** is used to load, compile, and manage AppArmor security profiles. It parses profiles from text format and loads them into the kernel. The parser also handles profile caching for faster subsequent loads.

# PARAMETERS

**-a, --add**
> Add/load a profile into the kernel

**-r, --replace**
> Replace an existing profile in the kernel

**-R, --remove**
> Remove a profile from the kernel

**-C, --Complain**
> Force the profile to load in complain mode (logs violations but does not block).

**-B, --binary**
> Treat the input as precompiled binary cache files rather than text profiles.

**-p, --preprocess**
> Preprocess the profile by flattening includes, without loading it.

**-o, --ofile file**
> Write the binary compiled profile to the given file.

**-S, --stdout**
> Write the binary compiled profile to stdout.

**-Q, --skip-kernel-load**
> Perform all actions except actually loading the profile into the kernel.

**-T, --skip-read-cache**
> Skip reading from the cache; always recompile.

**-W, --write-cache**
> Write the compiled profile to the cache directory.

**-K, --skip-cache**
> Disable both reading and writing of the cache.

**-L, --cache-loc dir**
> Specify the cache directory location.

**-m, --match-string string**
> Override the kernel feature set used when compiling.

**-v, --verbose**
> Report each profile as it is loaded and show warnings.

**-d, --debug**
> Check syntactic correctness; given twice, also dump the parser's interpretation.

**--warn=n**
> Enable specific compilation warnings.

**--abort-on-error**
> Stop processing on the first error rather than continuing.

# CONFIGURATION

**/etc/apparmor.d/**
> Directory containing AppArmor security profiles loaded at boot.

**/etc/apparmor.d/cache/**
> Directory for compiled binary profile caches.

# CAVEATS

Profiles must be syntactically correct or loading will fail. Use **-p** to preprocess and check for errors before loading.

# HISTORY

Part of the **AppArmor** application security framework developed by Immunix and later acquired by Novell. Now maintained by Canonical.

# INSTALL

```apt: sudo apt install apparmor```

```pacman: sudo pacman -S apparmor```

```apk: sudo apk add apparmor```

<!-- packages: 2026-07-22 -->
# SEE ALSO

[aa-status](/man/aa-status)(8), [aa-enforce](/man/aa-enforce)(8), [aa-complain](/man/aa-complain)(8), [apparmor](/man/apparmor)(7)

# RESOURCES

```[Source code](https://gitlab.com/apparmor/apparmor)```

```[Documentation](https://gitlab.com/apparmor/apparmor/-/wikis/home)```

<!-- verified: 2026-06-11 -->
