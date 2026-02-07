# TAGLINE

Report bugs in bash to the maintainers

# TLDR

**Report** bash bug

```bashbug```

# SYNOPSIS

**bashbug** [_--version_] [_email-address_]

# DESCRIPTION

**bashbug** is a script for reporting bugs in bash to the maintainers. It collects system information, bash version details, and opens an editor to compose a bug report, then emails it to the bash developers.

The tool ensures bug reports include necessary diagnostic information.

# WORKFLOW

1. Run `bashbug`
2. Editor opens with template
3. Describe the bug
4. Save and exit
5. Email sent to bash maintainers

# INFORMATION COLLECTED

- Bash version
- Operating system
- Machine architecture
- Compiler used
- Configuration options

# CAVEATS

Requires working mail system configured. May not work on all systems. Consider reporting bugs via the project's issue tracker instead. Modern bug reporting often done through online platforms.

# HISTORY

**bashbug** has been included with bash distributions since the early versions to facilitate bug reporting to the development team.

# SEE ALSO

[bash](/man/bash)(1), [reportbug](/man/reportbug)(1)
