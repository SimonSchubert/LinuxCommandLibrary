# TAGLINE

Internationalization support library for Git shell scripts

# TLDR

**Source for i18n support**

```. "$(git --exec-path)/git-sh-i18n"```

# SYNOPSIS

**git-sh-i18n**

# DESCRIPTION

**git-sh-i18n** is a shell scriptlet designed to be sourced (using **.**) by Git's porcelain programs implemented in shell script. It provides wrappers for the GNU **gettext** and **eval_gettext** functions accessible through the **gettext.sh** script, and provides pass-through fallbacks on systems without GNU gettext.

The **gettext** function translates a given string and outputs the result. The **eval_gettext** function translates a given string with variable placeholders, evaluating any variables in the result using **git-sh-i18n--envsubst**. This is not for end-user use; it is meant for Git's internal shell scripts.

# CAVEATS

Internal library, not a standalone command. Sourced by Git shell scripts via **. "$(git --exec-path)/git-sh-i18n"**. Not intended for direct end-user use. On systems without GNU gettext, the functions are dummy pass-throughs that simply output the untranslated string.

# HISTORY

git-sh-i18n is part of **Git's** internationalization system, enabling translated messages in shell-based git commands.

# SEE ALSO

[git-sh-setup](/man/git-sh-setup)(1), [gettext](/man/gettext)(1)
