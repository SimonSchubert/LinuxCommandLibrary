# TAGLINE

Prepare patches for email submission

# TLDR

**Create patches for last N commits**

```git format-patch -[n]```

**Create patch since commit**

```git format-patch [commit]```

**Create patch for range**

```git format-patch [commit1]..[commit2]```

**Output to directory**

```git format-patch -o [patches/] [commit]```

**Create single combined patch**

```git format-patch --stdout [commit] > [combined.patch]```

**Include cover letter**

```git format-patch --cover-letter [commit]```

**Create numbered, threaded patches with base info**

```git format-patch --numbered --thread --base=auto [commit]```

**Add email recipients to patches**

```git format-patch --to=[maintainer@example.com] --cc=[list@example.com] -[3]```

# SYNOPSIS

**git** **format-patch** [_options_] [_since_] | [_revision-range_]

# PARAMETERS

**-n**, **--numbered**
> Name output in [PATCH n/m] format.

**-N**, **--no-numbered**
> Name output in [PATCH] format without numbers.

**-o**, **--output-directory** _dir_
> Output directory for patch files.

**--stdout**
> Output all patches to stdout instead of files.

**--cover-letter**
> Generate a cover letter template for the patch series.

**-s**, **--signoff**
> Add Signed-off-by trailer.

**--subject-prefix** _prefix_
> Use given prefix instead of [PATCH].

**-v**, **--reroll-count** _n_
> Mark patches as v_n_ of the series (e.g., [PATCH v2]).

**--thread**[=_style_]
> Generate In-Reply-To and References headers. Style: shallow (default) or deep.

**--in-reply-to** _message-id_
> Make first mail appear as a reply to given message.

**--to** _email_
> Add To: header to patches. Can be used multiple times.

**--cc** _email_
> Add Cc: header to patches. Can be used multiple times.

**--base**[=_commit_]
> Record base tree info. Use "auto" for automatic selection.

**--no-stat**
> Generate plain patches without diffstats.

**--no-binary**
> Do not output binary file contents, only note changes.

**--interdiff** _previous_
> Insert interdiff into cover letter comparing to previous version.

**--range-diff** _previous_
> Insert range-diff into cover letter comparing to previous version.

**--filename-max-length** _n_
> Limit generated filenames to around _n_ bytes (default: 64).

# DESCRIPTION

**git format-patch** generates patch files from commits in a format suitable for email-based code review and submission workflows. Each commit is formatted as a separate .patch file containing the diff, commit metadata, and message in mbox format.

This command is fundamental to email-based development workflows used by projects like the Linux kernel and Git itself. The generated patches can be sent using git send-email or standard email clients, and applied with git am while preserving full commit information including author and date.

Cover letters (--cover-letter) provide a way to introduce patch series with context. Version numbering with -v supports iterative review cycles. The signoff option adds Signed-off-by trailers for Developer Certificate of Origin compliance.

# SEE ALSO

[git-am](/man/git-am)(1), [git-send-email](/man/git-send-email)(1), [git-apply](/man/git-apply)(1), [git-diff](/man/git-diff)(1)
