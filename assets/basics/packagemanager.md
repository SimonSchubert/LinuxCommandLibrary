# Package manager

## Which Package Manager?
Every distribution family ships its own package manager. Find yours in the table, then use the matching line in the sections below. Most install/remove operations need **sudo**.

| Package manager | Distribution |
|-----|-------------|
| **apt**, **apt-get**, **dpkg** | Debian, Ubuntu, Mint |
| **dnf**, **yum**, **rpm** | Fedora, RHEL, CentOS |
| **pacman** | Arch, Manjaro |
| **zypper** | openSUSE |
| **emerge** | Gentoo |
| **apk** | Alpine |
| **pkg** | FreeBSD, Termux |
| **snap**, **flatpak** | Distribution-independent app formats |

> **apt** is the friendlier front end to **apt-get**/**apt-cache** and the better choice for interactive use. On Fedora, **dnf** replaced **yum**.

## Install from repository
```[apt](/man/apt) install [packageName]```
```[dnf](/man/dnf) install [packageName]```
```[yum](/man/yum) install [packageName]```
```[pacman](/man/pacman) -S [packageName]```
```[zypper](/man/zypper) install [packageName]```
```[emerge](/man/emerge) -av [packageName]```
```[apk](/man/apk) add [packageName]```
```[pkg](/man/pkg) install [packageName]```
```[snap](/man/snap) install [packageName]```
```[flatpak](/man/flatpak) install [remote] [packageName]```

## Install from file
```[dpkg](/man/dpkg) -i [package.deb]```
```[apt](/man/apt) install ./[package.deb]```
```[dnf](/man/dnf) install [package.rpm]```
```[rpm](/man/rpm) -i [package.rpm]```
```[pacman](/man/pacman) -U [package.pkg.tar.zst]```
```[flatpak](/man/flatpak) install [package.flatpakref]```
```[pkg](/man/pkg) add [package.txz]```

> Prefer **apt install ./package.deb** over **dpkg -i**: apt resolves and installs missing dependencies, dpkg does not.

## Remove/Uninstall
```[apt](/man/apt) remove [packageName]```
```[dnf](/man/dnf) remove [packageName]```
```[yum](/man/yum) remove [packageName]```
```[pacman](/man/pacman) -Rs [packageName]```
```[zypper](/man/zypper) remove [packageName]```
```[emerge](/man/emerge) --depclean [packageName]```
```[apk](/man/apk) del [packageName]```
```[pkg](/man/pkg) delete [packageName]```
```[snap](/man/snap) remove [packageName]```
```[flatpak](/man/flatpak) uninstall [packageName]```

> **apt purge** also deletes the package's system-wide configuration files; **pacman -Rs** removes the package together with dependencies nothing else needs.

Clean up dependencies that are no longer needed by anything.
```[apt](/man/apt) autoremove```
```[dnf](/man/dnf) autoremove```
```[pacman](/man/pacman) -Qdtq```

## Find a package
```[apt](/man/apt) search [query]```
```[apt-cache](/man/apt-cache) search [query]```
```[dnf](/man/dnf) search [query]```
```[yum](/man/yum) search [query]```
```[pacman](/man/pacman) -Ss [query]```
```[zypper](/man/zypper) search [query]```
```[emerge](/man/emerge) -S [query]```
```[apk](/man/apk) search [query]```
```[pkg](/man/pkg) search [query]```
```[snap](/man/snap) find [query]```
```[flatpak](/man/flatpak) search [query]```

## View package info
```[apt](/man/apt) show [packageName]```
```[apt-cache](/man/apt-cache) show [packageName]```
```[dpkg](/man/dpkg) -s [packageName]```
```[dnf](/man/dnf) info [packageName]```
```[yum](/man/yum) info [packageName]```
```[pacman](/man/pacman) -Si [packageName]```
```[zypper](/man/zypper) info [packageName]```
```[apk](/man/apk) info [packageName]```
```[pkg](/man/pkg) info [packageName]```
```[snap](/man/snap) info [packageName]```
```[pip](/man/pip) show [packageName]```

## Update package lists
Refresh the list of available packages and versions without installing anything.
```[apt](/man/apt) update```
```[dnf](/man/dnf) check-update```
```[yum](/man/yum) check-update```
```[zypper](/man/zypper) refresh```
```[emerge](/man/emerge) --sync```
```[apk](/man/apk) update```
```[pkg](/man/pkg) update```

## Upgrade installed packages
```[apt](/man/apt) upgrade```
```[dnf](/man/dnf) upgrade```
```[yum](/man/yum) update```
```[pacman](/man/pacman) -Syu```
```[zypper](/man/zypper) update```
```[emerge](/man/emerge) -avuDN @world```
```[apk](/man/apk) upgrade```
```[pkg](/man/pkg) upgrade```
```[snap](/man/snap) refresh```
```[flatpak](/man/flatpak) update```

> On Arch, always sync and upgrade together with **pacman -Syu**. Refreshing the database with **-Sy** and then installing single packages can break the system (partial upgrade).

## Which package owns a file?
```[dpkg](/man/dpkg) -S /usr/bin/[file]```
```[dnf](/man/dnf) provides /usr/bin/[file]```
```[rpm](/man/rpm) -qf /usr/bin/[file]```
```[pacman](/man/pacman) -Qo /usr/bin/[file]```

List the files a package installed.
```[dpkg](/man/dpkg) -L [packageName]```
```[rpm](/man/rpm) -ql [packageName]```
```[pacman](/man/pacman) -Ql [packageName]```

## Add repository source
```[add-apt-repository](/man/add-apt-repository) ppa:[userName]/[ppaName]```
```[dnf](/man/dnf) config-manager --add-repo [url]```
```[yum-config-manager](/man/yum-config-manager) --add-repo [url]```
```[zypper](/man/zypper) addrepo [url] [alias]```
```[flatpak](/man/flatpak) remote-add flathub https://flathub.org/repo/flathub.flatpakrepo```

## List installed packages
```[apt](/man/apt) list --installed```
```[dpkg](/man/dpkg) -l```
```[dnf](/man/dnf) list installed```
```[rpm](/man/rpm) -qa```
```[pacman](/man/pacman) -Q```
```[zypper](/man/zypper) packages --installed-only```
```[apk](/man/apk) list --installed```
```[snap](/man/snap) list```
```[flatpak](/man/flatpak) list```
```[pip](/man/pip) list```

## AUR Helpers
On Arch, **yay** and **paru** install community packages from the AUR with the same flags as pacman.
```[yay](/man/yay) -S [packageName]```
```[paru](/man/paru) -S [packageName]```
