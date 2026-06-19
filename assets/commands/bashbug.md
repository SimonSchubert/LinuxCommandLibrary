# TAGLINE

Report bugs in bash to the maintainers

# TLDR

**Report** bash bug

```bashbug```

# SYNOPSIS

**bashbug** [_--help_] [_--version_] [_email-address_]

# DESCRIPTION

**bashbug** is a script for reporting bugs in bash to the maintainers. It collects system information, bash version details, and opens an editor to compose a bug report, then emails it to the bash developers.

By default stable releases send the report to **bug-bash@gnu.org**; an optional _email-address_ argument overrides the recipient. The editor is chosen from **DEFEDITOR**, **EDITOR**, or **VISUAL**, falling back to common editors and finally **vi**.

# PARAMETERS

**--help**
> Print usage information and exit.

**--version**
> Print the bashbug version and exit.

_email-address_
> Send the report to this address instead of the default.

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

# RESOURCES

```[Homepage](https://www.gnu.org/software/bash/)```

```[Source code](https://git.savannah.gnu.org/cgit/bash.git)```

<!-- verified: 2026-06-19 -->
