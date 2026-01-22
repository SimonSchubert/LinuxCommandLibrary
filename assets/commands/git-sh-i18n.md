# TLDR

**Source for i18n support**

```. "$(git --exec-path)/git-sh-i18n"```

# SYNOPSIS

**git-sh-i18n**

# DESCRIPTION

**git-sh-i18n** is a shell library providing internationalization support for git shell scripts. It's sourced by scripts that need to display translated messages.

The library provides functions for message translation using gettext. It handles locale detection and fallback to English when translations aren't available.

git-sh-i18n is internal infrastructure for git script localization.

# CAVEATS

Internal library, not a command. Sourced by git shell scripts. Not for direct use.

# HISTORY

git-sh-i18n is part of **Git's** internationalization system, enabling translated messages in shell-based git commands.

# SEE ALSO

[git-sh-setup](/man/git-sh-setup)(1), [gettext](/man/gettext)(1)
