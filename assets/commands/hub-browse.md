# TLDR

**Open repo in browser**

```hub browse```

**Open issues page**

```hub browse -- issues```

**Open pull requests**

```hub browse -- pulls```

**Open specific issue**

```hub browse -- issues/[123]```

**Open wiki**

```hub browse -- wiki```

**Open different repo**

```hub browse [owner/repo]```

# SYNOPSIS

**hub** **browse** [_options_] [_owner/repo_] [-- _subpage_]

# PARAMETERS

**-u**, **--url**
> Print URL instead of opening browser.

**-c**, **--copy**
> Copy URL to clipboard.

**--**
> Separator for subpage path.

# DESCRIPTION

**hub browse** opens the GitHub repository page in your web browser. You can specify subpages like issues, pulls, wiki, commits, or specific file paths. Works with the current repository by default or specify another repo.

# CAVEATS

Hub is deprecated. Consider using **gh browse** instead.

# SEE ALSO

[hub](/man/hub)(1), [gh-browse](/man/gh-browse)(1)

