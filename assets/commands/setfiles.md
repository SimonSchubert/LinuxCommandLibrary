# TLDR

Set file contexts according to the **default policy**

```sudo setfiles /etc/selinux/targeted/contexts/files/file_contexts [path/to/directory]```

Set file contexts **recursively** and show changes

```sudo setfiles -v /etc/selinux/targeted/contexts/files/file_contexts [path/to/directory]```

**Preview** changes without modifying contexts

```sudo setfiles -n /etc/selinux/targeted/contexts/files/file_contexts [path/to/directory]```

**Force** complete context replacement

```sudo setfiles -F /etc/selinux/targeted/contexts/files/file_contexts [path/to/directory]```

Use **multiple threads** for faster processing

```sudo setfiles -T 4 /etc/selinux/targeted/contexts/files/file_contexts [path/to/directory]```

**Exclude** a directory from relabeling

```sudo setfiles -e [path/to/exclude] /etc/selinux/targeted/contexts/files/file_contexts [path/to/directory]```

# SYNOPSIS

**setfiles** [**-cdlmnpsvFIUW**] [**-e** _dir_] [**-r** _rootpath_] [**-T** _nthreads_] _spec_file_ _pathname_...

# PARAMETERS

**-c** _policy_
> Validate contexts against the specified binary policy file

**-d**
> Show which specification matched each file (debug)

**-e** _directory_
> Exclude directory from labeling (can be repeated)

**-f** _infilename_
> Read list of files to process from a file

**-F**
> Force complete context replacement including user, role, and range

**-n**
> Dry run; show what would be changed without modifying

**-p**
> Show progress as percentage or 1024-block increments

**-r** _rootpath_
> Use alternate root path for context matching

**-s**
> Log changes to syslog instead of stdout

**-v**
> Verbose; show files whose labels are changed

**-T** _nthreads_
> Number of threads to use (0 = number of CPU cores)

**-I**
> Ignore stored directory digests; force label checking

**-D**
> Set or update directory SHA1 digests in extended attributes

# DESCRIPTION

**setfiles** initializes and corrects SELinux security context labels on filesystems based on pattern-to-context mappings in a specification file. It is the primary tool for relabeling files after SELinux policy changes or system installation.

The specification file (typically **/etc/selinux/targeted/contexts/files/file_contexts**) contains regular expressions matched against file paths to determine appropriate security contexts. Unlike **restorecon**, setfiles requires an explicit specification file argument.

# CAVEATS

Requires SELinux to be enabled; on non-SELinux systems, the command has no effect. Relabeling large filesystems can be time-consuming. Using **-F** forces all context components to change, which may disrupt running services. The **-n** dry-run option should be used first on production systems.

# HISTORY

**setfiles** is part of the SELinux **policycoreutils** package, developed alongside SELinux at the **NSA** (National Security Agency) starting in **2000**. SELinux was merged into the Linux kernel mainline in **2003** with version **2.6**. The tool has evolved to support multi-threading and digest-based optimization.

# SEE ALSO

[restorecon](/man/restorecon)(8), [fixfiles](/man/fixfiles)(8), [semanage](/man/semanage)(8), [semanage-fcontext](/man/semanage-fcontext)(8)
