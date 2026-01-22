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

**apparmor_parser** [_options_] [_profile_]

# DESCRIPTION

**apparmor_parser** is used to load, compile, and manage AppArmor security profiles. It parses profiles from text format and loads them into the kernel. The parser also handles profile caching for faster subsequent loads.

# PARAMETERS

**-a, --add**
> Add/load a profile into the kernel

**-r, --replace**
> Replace an existing profile in the kernel

**-R, --remove**
> Remove a profile from the kernel

**-C, --complain**
> Load profile in complain mode (logs but doesn't block)

**-p, --preprocess**
> Preprocess the profile (resolve includes)

**-o, --ofile file**
> Write binary output to file

**-S, --stdout**
> Print binary profile to stdout

**-Q, --skip-kernel-load**
> Don't load profile into kernel

**-T, --skip-read-cache**
> Skip reading from cache

**-W, --write-cache**
> Write profile to cache

**-L, --cache-loc dir**
> Specify cache directory location

**-v, --verbose**
> Verbose output

**-d, --debug**
> Enable debug output

# CAVEATS

Profiles must be syntactically correct or loading will fail. Use **-p** to preprocess and check for errors before loading.

# HISTORY

Part of the **AppArmor** application security framework developed by Immunix and later acquired by Novell. Now maintained by Canonical.

# SEE ALSO

[aa-status](/man/aa-status)(8), [aa-enforce](/man/aa-enforce)(8), [aa-complain](/man/aa-complain)(8), [apparmor](/man/apparmor)(7)
