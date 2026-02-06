# Package manager

## Install from repository
```[snap](/man/snap) install [packageName]```
```[flatpak](/man/flatpak) install [remote] [packageName]```
```[apt](/man/apt) install [packageName]```
```[yum](/man/yum) install [packageName]```
```[dnf](/man/dnf) install [packageName]```
```[pkg](/man/pkg) install [packageName]```
```[apt-get](/man/apt-get) install [packageName]```
```[pacman](/man/pacman) -S [packageName]```
```[pip](/man/pip) install [packageName]```
```[zypper](/man/zypper) install [packageName]```

## Install from file
```[flatpak](/man/flatpak) install [package.flatpakref]```
```[dpkg](/man/dpkg) -i [package.deb]```
```[rpm](/man/rpm) -i [package.rpm]```
```[yum](/man/yum) install [package.rpm]```
```[dnf](/man/dnf) install [package.rpm]```
```[pkg](/man/pkg) add [package.txz]```
```[pacman](/man/pacman) -U [package.tar.gz]```
```[pip](/man/pip) install [/path/to/package]```

## Remove/Uninstall
```[snap](/man/snap) remove [packageName]```
```[apt-get](/man/apt-get) remove [packageName]```
```[apt](/man/apt) remove [packageName]```
```[yum](/man/yum) remove [packageName]```
```[dnf](/man/dnf) erase [packageName]```
```[flatpak](/man/flatpak) uninstall [packageName]```
```[pkg](/man/pkg) delete [packageName]```
```[pacman](/man/pacman) -R [packageName]```
```[pip](/man/pip) uninstall [packageName]```
```[zypper](/man/zypper) rm [packageName]```

## Find a package
```[snap](/man/snap) find [query]```
```[flatpak](/man/flatpak) search [query]```
```[apt-cache](/man/apt-cache) search [query]```
```[apt](/man/apt) search [query]```
```[yum](/man/yum) search [query]```
```[dnf](/man/dnf) search [query]```
```[pkg](/man/pkg) search [query]```
```[pacman](/man/pacman) -Ss [query]```
```[pip](/man/pip) search [query]```
```[zypper](/man/zypper) search [packageName]```

## View package info
```[snap](/man/snap) info [packageName]```
```[apt-cache](/man/apt-cache) show [packageName]```
```[apt](/man/apt) show [packageName]```
```[dpkg](/man/dpkg) -s [packageName]```
```[yum](/man/yum) info [packageName]```
```[dnf](/man/dnf) info [packageName]```
```[pkg](/man/pkg) info [packageName]```
```[pacman](/man/pacman) -Si [packageName]```
```[pip](/man/pip) show [packageName]```

## Update package lists
```[apt-get](/man/apt-get) update```
```[apt](/man/apt) update```
```[yum](/man/yum) check-update```
```[dnf](/man/dnf) check-update```
```[pkg](/man/pkg) update```
```[pacman](/man/pacman) -Sy```
```[zypper](/man/zypper) refresh```

## Upgrade installed packages
```[snap](/man/snap) refresh```
```[flatpak](/man/flatpak) update```
```[apt-get](/man/apt-get) upgrade```
```[apt](/man/apt) upgrade```
```[yum](/man/yum) update```
```[dnf](/man/dnf) upgrade```
```[pkg](/man/pkg) upgrade```
```[pacman](/man/pacman) -Syu```
```[pip](/man/pip) install [packageName] --upgrade```
```[zypper](/man/zypper) update```

## Add repository source
```[add-apt-repository](/man/add-apt-repository) ppa:[userName]/[ppaName]```
```[add-apt-repository](/man/add-apt-repository) deb [url] [derivative]```
```[yum-config-manager](/man/yum-config-manager) --add-repo [url]```
```[dnf](/man/dnf) config-manager --add-repo [url]```
```[zypper](/man/zypper) addrepo [url] [alias]```

## List installed packages
```[snap](/man/snap) list```
```[flatpak](/man/flatpak) list```
```[apt](/man/apt) list --installed```
```[dpkg](/man/dpkg) -l```
```[rpm](/man/rpm) -qa```
```[pacman](/man/pacman) -Q```
```[pip](/man/pip) list```
