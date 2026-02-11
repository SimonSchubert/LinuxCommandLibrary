# TAGLINE

Arch Linux AUR helper

# TLDR


**Interactively search** and install packages from the repos and AUR

```yay [package_name|search_term]```

  
**Synchronize and update** all packages from the repos and AUR

```yay```

  
**Install** a new package from the repos and AUR and do not ask to confirm transactions

```yay -S [package] --noconfirm```

  
**Remove** an installed package and both its dependencies and configuration files

```yay -Rns [package]```

  
**Search** the package database for a keyword from the repos and AUR

```yay -Ss [keyword]```

  
**Remove orphaned packages** (installed as dependencies but not required by any package)

```yay -Yc```

  
**Clean pacman and yay caches** (old package versions kept for rollback and downgrade purposes)

```yay -Scc```

  
**Show statistics for** installed packages and system health

```yay -Ps```

# SYNOPSIS

**yay** \<operation\> [options] [targets]

# DESCRIPTION

Yay is a Pacman wrapper with AUR support. It passes options to Makepkg and Pacman after resolving packages to install/upgrade.

#  YAY OPERATIONS

**-Y, --yay**

> Perform yay specific operations. This is the default if no other operation is selected.

**-P, --show**

> Perform yay specific print operations.

**-G, --getpkgbuild**

> Downloads PKGBUILD from ABS or AUR. The ABS can only be used for Arch Linux repositories

If **no arguments are provided** 'yay -Syu' will be performed.

If **no operation is selected** -Y will be assumed.

# EXTENDED PACMAN OPERATIONS

**-S, -Si, -Sl, -Ss, -Su, -Sc, -Qu**

> These operations are extended to support both AUR and repo packages.

**-Sc**

> Yay will also clean cached AUR package and any untracked Files in the cache. Cleaning untracked files will wipe any downloaded sources or built packages but will keep already downloaded vcs sources.

**-R**

> Yay will also remove cached data about devel packages.

# YAY OPTIONS (APPLY TO -Y AND --YAY)

**<NO OPTION>**

> Displays a list of packages matching the search terms and prompts the user on which packages to install (yogurt mode).

**--gendb**

> Generate development package database. Tracks the latest commit for each development package, when there is a new commit Yay will know to update. This is done per package whenever a package is synced. This option should only be used when migrating to Yay from another AUR helper.

**-c, --clean**

> Remove unneeded dependencies.

# SHOW OPTIONS (APPLY TO -P AND --SHOW)

**-c, --complete**

> Print a list of all AUR and repo packages. This allows shell completion and is not intended to be used directly by the user.

**-f, --fish**

> During complete adjust the output for the fish shell.

**-d, --defaultconfig**

> Print default yay configuration.

**-g, --currentconfig**

> Print current yay configuration.

**-n, --numberupgrades**

> Deprecated, use  **yay -Qu**  and  **wc -l**  instead.

**-s, --stats**

> Displays information about installed packages and system health. If there are orphaned, or out-of-date packages, or packages that no longer exist on the AUR; warnings will be displayed.

**-u, --upgrades**

> Deprecated, use  **yay -Qu**  instead.

**-w, --news**

> Print new news from the Archlinux homepage. News is considered new if it is newer than the build date of all native packages. Pass this twice to show all available news.

**-q, --quiet**

> Only show titles when printing news.

# PERMANENT CONFIGURATION SETTINGS

**--save**

> Causes the following options to be saved back to the config file. This provides an easy way to change config options without directly editing the file.

**--aururl**

> Set an alternative AUR URL. This is mostly useful for users in China who wish to use https://aur.tuna.tsinghua.edu.cn/.

**--builddir <dir>**

> Directory to use for Building AUR Packages. This directory is also used as the AUR cache when deciding if Yay should skip builds.

**--editor <command>**

> Editor to use when editing PKGBUILDs. If this is not set the  **EDITOR**  environment variable will be checked, followed by  **VISUAL**. If none of these are set Yay will prompt the user for an editor.

**--editorflags <flags>**

> Passes arguments to the editor. These flags get passed to every instance where the editor is called by Yay. Arguments are split on whitespace before being passed to the editor. Multiple arguments may be passed by supplying a space separated list that is quoted by the shell.

**--makepkg <command>**

> The command to use for  **makepkg**  calls. This can be a command in  **PATH**  or an absolute path to the file.

**--pacman <command>**

> The command to use for  **pacman**  calls. This can be a command in  **PATH**  or an absolute path to the file.

**--tar <command>**

> The command to use for  **bsdtar**  calls. This can be a command in  **PATH**  or an absolute path to the file.

**--git <command>**

> The command to use for  **git**  calls. This can be a command in  **PATH**  or an absolute path to the file.

**--gpg <command>**

> The command to use for  **gpg**  calls. This can be a command in  **PATH**  or an absolute path to the file.

**--config <file>**

> The pacman config file to use.

**--makepkgconf <file>**

> The config file for makepkg to use. If this is not set then the default config file will be used.

**--nomakepkgconf**

> Reset the makepkg config file back to its default.

**--requestsplitn <number>**

> The maximum amount of packages to request per AUR query. The higher the number the faster AUR requests will be. Requesting too many packages in one AUR query will cause an error. This should only make a noticeable difference with very large requests (>500) packages.

**--completioninterval <days>**

> Time in days to refresh the completion cache. Setting this to 0 will cause the cache to be refreshed every time, while setting this to -1 will cause the cache to never be refreshed.

**--sortby <votes|popularity|id|baseid|name|base|submitted|modified>**

> Sort AUR results by a specific field during search.

**--searchby <name|name-desc|maintainer|depends|checkdepends|makedepends|optdepends>**

> Search for AUR packages by querying the specified field.

**--answerclean <All|None|Installed|NotInstalled|...>**

> Set a predetermined answer for the clean build menu question. This answer will be used instead of reading from standard input but will be parsed exactly the same.

**--answerdiff <All|None|Installed|NotInstalled|...>**

> Set a predetermined answer for the edit diff menu question. This answer will be used instead of reading from standard input but will be parsed exactly the same.

**--answeredit <All|None|Installed|NotInstalled|...>**

> Set a predetermined answer for the edit pkgbuild menu question. This answer will be used instead of reading from standard input but will be parsed exactly the same.

**--answerupgrade <Repo|^Repo|None|...>**

> Set a predetermined answer for the upgrade menu question. Selects which package ranges or repos to omit for updates. This answer will be used instead of reading from standard input but will be treated exactly the same.

**--noanswerclean**

> Unset the answer for the clean build menu.

**--noanswerdiff**

> Unset the answer for the diff menu.

**--noansweredit**

> Unset the answer for the edit pkgbuild menu.

**--noanswerupgrade**

> Unset the answer for the upgrade menu.

**--cleanmenu**

> Show the clean menu. This menu gives you the chance to fully delete the downloaded build files from Yay's cache before redownloading a fresh copy.

**--diffmenu**

> Show the diff menu. This menu gives you the option to view diffs from build files before building.

Diffs are shown via  **git diff**  which uses less by default. This behaviour can be changed via git's config, the  **$GIT_PAGER**  or  **$PAGER**  environment variables.

**--editmenu**

> Show the edit menu. This menu gives you the option to edit or view PKGBUILDs before building.

**Warning**: Yay resolves dependencies ahead of time via the RPC. It is not recommended to edit pkgbuild variables unless you know what you are doing.

**--upgrademenu**

> Show a detailed list of updates in a similar format to VerbosePkgLists. Upgrades can also be skipped using numbers, number ranges or repo names. Additionally ^ can be used to invert the selection.

**Warning**: It is not recommended to skip updates from the repositories as this can lead to partial upgrades. This feature is intended to easily skip AUR updates on the fly that may be broken or have a long compile time. Ultimately it is up to the user what upgrades they skip.

**--nocleanmenu**

> Do not show the clean menu.

**--nodiffmenu**

> Do not show the diff menu.

**--noeditmenu**

> Do not show the edit menu.

**--noupgrademenu**

> Do not show the upgrade menu.

**--askremovemake**

> Ask to remove makedepends after installing packages.

**--removemake**

> Remove makedepends after installing packages.

**--noremovemake**

> Do not remove makedepends after installing packages.

**--topdown**

> Display repository packages first and then AUR packages.

**--bottomup**

> Show AUR packages first and then repository packages.

**--singlelineresults**

> Override pacman's usual double-line search result format and list each result on its own line.

**--doublelineresults**

> Follow pacman's double-line search result format and list each result using two lines.

**--devel**

> During sysupgrade also check AUR development packages for updates. Currently only Git packages are supported.

Devel checking is done using  **git ls-remote**. The newest commit hash is compared against the hash at install time. This allows devel updates to be checked almost instantly and not require the original pkgbuild to be downloaded.

The slower pacaur-like devel checks can be implemented manually by piping a list of packages into yay (see  **examples**).

**--nodevel**

> Do not check for development packages updates during sysupgrade.

**--cleanafter**

> Remove untracked files after installation.

Untracked files are removed with the exception of directories. This allows VCS packages to easily pull an update instead of having to reclone the entire repo.

**--nocleanafter**

> Do not remove package sources after successful Install.

**--timeupdate**

> During sysupgrade also compare the build time of installed packages against the last modification time of each package's AUR page.

**--notimeupdate**

> Do not consider build times during sysupgrade.

**--redownload**

> Always download pkgbuilds of targets even when a copy is available in cache.

**--redownloadall**

> Always download pkgbuilds of all AUR packages even when a copy is available in cache.

**--noredownload**

> When downloading pkgbuilds if the pkgbuild is found in cache and is equal or newer than the AUR's version use that instead of downloading a new one.

**--provides**

> Look for matching providers when searching for AUR packages. When multiple providers are found a menu will appear prompting you to pick one. This increases dependency resolve time although this should not be noticeable.

**--noprovides**

> Do not look for matching providers when searching for AUR packages. Yay will never show its provider menu but Pacman will still show its provider menu for repo packages.

**--pgpfetch**

> Prompt to import unknown PGP keys from the  **validpgpkeys**  field of each PKGBUILD.

**--nopgpfetch**

> Do not prompt to import unknown PGP keys. This is likely to cause a build failure unless using options such as  **--skippgpcheck**  or a customized gpg config.

**--useask**

> Use pacman's --ask flag to automatically confirm package conflicts. Yay lists conflicts ahead of time. It is possible that Yay does not detect a conflict, causing a package to be removed without the user's confirmation. However, this is very unlikely.

**--nouseask**

> Manually resolve package conflicts during the install. Packages which do not conflict will not need to be confined manually.

**--combinedupgrade**

> During sysupgrade, Yay will first perform a refresh, then show its combined menu of repo and AUR packages that will be upgraded. Then after reviewing the pkgbuilds, the repo and AUR upgrade will start with no need for manual intervention.

If Yay exits for any reason After the refresh without upgrading. It is then the user's responsibility to either resolve the reason Yay exited or run a sysupgrade through pacman directly.

**--nocombinedupgrade**

> During sysupgrade, Pacman -Syu will be called, then the AUR upgrade will start. This means the upgrade menu and pkgbuild review will be performed after the sysupgrade has finished.

**--batchinstall**

> When building and installing AUR packages instead of installing each package after building, queue each package for install. Then once either all packages are built or a package in the build queue is needed as a dependency to build another package, install all the packages in the install queue.

**--nobatchinstall**

> Always install AUR packages immediately after building them.

**--rebuild**

> Always build target packages even when a copy is available in cache.

**--rebuildall**

> Always build all AUR packages even when a copy is available in cache.

**--rebuildtree**

> When installing an AUR package rebuild and reinstall all of its AUR dependencies recursively, even the ones already installed. This flag allows you to easily rebuild packages against your current system's libraries if they have become incompatible.

**--norebuild**

> When building packages if the package is found in cache and is an equal version to the one wanted skip the package build and use the existing package.

**--mflags <flags>**

> Passes arguments to makepkg. These flags get passed to every instance where makepkg is called by Yay. Arguments are split on whitespace before being passed to makepkg. Multiple arguments may be passed by supplying a space separated list that is quoted by the shell.

**--gpgflags <flags>**

> Passes arguments to gpg. These flags get passed to every instance where gpg is called by Yay. Arguments are split on whitespace before being passed to gpg. Multiple arguments may be passed by supplying a space separated list that is quoted by the shell.

**--sudo <command>**

> The command to use for  **sudo**  calls. This can be a command in  **PATH**  or an absolute path to the file. The sudoloop is not guaranteed to work with a custom  **sudo**  command.

**--sudoflags <flags>**

> Passes arguments to sudo. These flags get passed to every instance where sudo is called by Yay. Arguments are split on whitespace before being passed to sudo. Multiple arguments may be passed by supplying a space separated list that is quoted by the shell.

**--sudoloop**

> Loop sudo calls in the background to prevent sudo from timing out during long builds.

**--nosudoloop**

> Do not loop sudo calls in the background.

# CAVEAT

Like other AUR helpers, yay facilitates installing **user-submitted packages** from the Arch User Repository, which **aren't officially vetted** and could potentially contain malicious code—always review the PKGBUILD file before proceeding with installation to mitigate security risks.

# HISTORY

The yay command, short for "**Yet Another Yogurt**," is an AUR (Arch User Repository) helper tool written in **Go**, designed to simplify installing and managing packages on **Arch Linux** and its derivatives. It was created by developer Jguer and first initiated in **September 2016**.

# SEE ALSO

[makepkg](/man/makepkg)(8), [pacman](/man/pacman)(8)
