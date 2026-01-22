# TLDR

Lookup the **persistent security context** setting of an absolute path

```matchpathcon [/path/to/file]```

Restrict lookup to settings on a **specific file type**

```matchpathcon -m [file|dir|pipe|chr_file|blk_file|lnk_file|sock_file] [/path/to/file]```

**Verify** that the persistent and current security context agree

```matchpathcon -V [/path/to/file]```

# SYNOPSIS

**matchpathcon** [_options_] _path_...

# PARAMETERS

**-m _type_**
> Restrict lookup to a specific file type: file, dir, pipe, chr_file, blk_file, lnk_file, or sock_file

**-V**
> Verify that the current context matches the expected persistent context

**-n**
> Do not display the path in output

**-N**
> Do not look up the context in the policy

**-P _policy_path_**
> Use an alternate policy root path

# DESCRIPTION

**matchpathcon** looks up the default SELinux security context for a given file path based on the file context configuration. It shows what context a file **should** have according to the SELinux policy, regardless of its current context.

This is useful for diagnosing SELinux issues—comparing the expected context (from matchpathcon) with the actual context (from **ls -Z**) reveals whether a file has been mislabeled.

The **-V** (verify) option directly compares the expected and actual contexts, reporting mismatches that may cause SELinux denials.

# CAVEATS

Only works on systems with SELinux enabled. The lookup is based on file path patterns, not actual file attributes. A path may match multiple patterns; the most specific pattern wins. This command shows policy defaults, not runtime overrides.

# SEE ALSO

[semanage-fcontext](/man/semanage-fcontext)(8), [restorecon](/man/restorecon)(8), [chcon](/man/chcon)(1), [secon](/man/secon)(1), [ls](/man/ls)(1)
