# TAGLINE

Select Gentoo distfiles and rsync mirrors

# TLDR

**Interactively** choose source mirrors

```sudo mirrorselect [-i|--interactive]```

Limit the interactive list to one **country**

```sudo mirrorselect [-i|--interactive] [-c|--country] "[Germany]"```

Pick the **fastest** mirrors automatically

```sudo mirrorselect [-s|--servers] [3]```

Rank mirrors by **downloading** a test file

```sudo mirrorselect [-D|--deep] [-s|--servers] [3]```

Consider **HTTPS** mirrors only

```sudo mirrorselect [-S|--https] [-s|--servers] [3]```

**Print** the result instead of editing `make.conf`

```mirrorselect [-s|--servers] [3] [-o|--output]```

Choose an **rsync** mirror and append it to the repo config

```mirrorselect [-i|--interactive] [-r|--rsync] [-o|--output] | sudo tee -a /etc/portage/repos.conf/gentoo.conf```

# SYNOPSIS

**mirrorselect** [_options_]

# DESCRIPTION

**mirrorselect** chooses Gentoo download mirrors and writes them into Portage configuration. For distfiles it sets `GENTOO_MIRRORS` in `/etc/portage/make.conf`. With **--rsync** it selects the rsync mirror used to sync the Gentoo ebuild repository.

Automatic mode (the default when neither **--interactive** nor **--all_mirrors** is given) probes mirrors and keeps the fastest ones. The default count is 3. Shallow mode times a short HTTP request and skips mirrors whose timestamp is stale. **--deep** downloads a test file of about 100 kB from each candidate, which is slower and needs a decent connection.

Interactive mode shows a checklist of mirrors. **--all_mirrors** writes every mirror that survives the filters (for rsync, only the rotation server, because multiple rsync URLs are not supported).

Without **--output**, the tool rewrites the Portage file and keeps mirrors that were already configured, adding the newly selected URLs. It moves the previous file aside as a backup. **--output** prints the setting to stdout and leaves the files alone, which is the usual pattern while installing Gentoo from a live environment.

Run with no arguments and it prints help, then exits with status 1.

# PARAMETERS

**-h**, **--help**
> Print a usage summary and exit.

**--version**
> Print the version and exit.

**-i**, **--interactive**
> Present a checklist and let the user pick mirrors. Cannot be combined with **--deep**, **--blocksize**, or **--servers**.

**-a**, **--all_mirrors**
> Use every mirror that passes the filters, instead of speed-testing. Cannot be combined with **--servers**. With **--rsync**, only the rotation server is selected.

**-D**, **--deep**
> Download a test file from each mirror and rank by transfer time. Prefer this only on a fast link.

**-s** _N_, **--servers** _N_
> How many download mirrors automatic mode should keep. Default is 3. Not valid for rsync mirrors.

**-b** _N_, **--blocksize** _N_
> How many mirrors to probe at once in automatic mode. Useful when a router drops large bursts of connections. A typical pair is `-s 3 -b 10`.

**-c** _COUNTRY_, **--country** _COUNTRY_
> Only consider mirrors in _COUNTRY_. Quote names that contain spaces, for example `'South Korea'`.

**-R** _REGION_, **--region** _REGION_
> Only consider mirrors in _REGION_. Quote names that contain spaces, for example `'North America'`.

**-F**, **--ftp**
> Consider FTP mirrors only.

**-H**, **--http**
> Consider HTTP mirrors only.

**-S**, **--https**
> Consider HTTPS mirrors only.

**-r**, **--rsync**
> Select an rsync mirror instead of distfiles mirrors. Requires **--interactive** or **--all_mirrors**.

**-4**, **--ipv4**
> Use IPv4 only.

**-6**, **--ipv6**
> Use IPv6 only. Ignored outside interactive mode when Python has no IPv6 support.

**-o**, **--output**
> Print the configuration text to stdout. Do not modify Portage files.

**-t** _SECONDS_, **--timeout** _SECONDS_
> Timeout for deep-mode transfers. Default is 10 seconds.

**-f** _FILE_, **--file** _FILE_
> Alternate file to download in deep mode. Must be paired with **--md5**. Keep the file small.

**-m** _SUM_, **--md5** _SUM_
> Expected MD5 of the **--file** download.

**-e** _HOST_, **--exclude** _HOST_
> Drop _HOST_ from the candidate list. Repeat to exclude more than one.

**-P** _URL_, **--proxy** _URL_
> Proxy to use when the environment proxy is not the one you want.

**-q**, **--quiet**
> Quiet mode.

**-d** _LEVEL_, **--debug** _LEVEL_
> Debug verbosity from 1 to 9. Default verbosity is 1.

# CONFIGURATION

**/etc/portage/make.conf**
> Distfiles selection updates `GENTOO_MIRRORS` here. The previous file is saved as a backup before the rewrite.

**/etc/portage/repos.conf/gentoo.conf**
> Rsync selection updates `sync-uri` in this file. The file must already exist (copy it from `/usr/share/portage/config/repos.conf` if Portage has not created it). If it is missing, mirrorselect exits.

# CAVEATS

Gentoo-specific. It is installed as `app-portage/mirrorselect` and is not a general-purpose mirror picker.

Choose at most one of **--ftp**, **--http**, **--https**, and **--rsync**. **--ipv4** and **--ipv6** are also mutually exclusive.

Rsync mirrors can only be chosen with **--interactive** or **--all_mirrors**. Deep mode contacts every remaining mirror, so a country or region filter is worth setting first.

Writing the config normally requires root. **--output** does not.

# HISTORY

**mirrorselect** has shipped with Gentoo's Portage tools since **2005**. Early authors include Colin Kingsley, Zac Medico, Sebastian Pipping, Christian Ruppert, and Brian Dolbec. Current releases probe mirrors over HTTP instead of relying on `netselect`.

# SEE ALSO

[emerge](/man/emerge)(1), [emaint](/man/emaint)(1), [equery](/man/equery)(1), [eix](/man/eix)(1), [portageq](/man/portageq)(1), [rsync](/man/rsync)(1)

# RESOURCES

```[Source code](https://gitweb.gentoo.org/proj/mirrorselect.git)```

```[Documentation](https://wiki.gentoo.org/wiki/Mirrorselect)```

<!-- verified: 2026-10-18 -->
