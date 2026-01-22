# Files & Folders

## Create file
```[touch](/man/touch) [fileName]```
```[echo](/man/echo) $null >> [fileName]```

## Delete file
```[rm](/man/rm) [fileName]```

## Display file content
```[cat](/man/cat) [fileName]```

## Edit text file
```[vi](/man/vi) [fileName]```
```[nano](/man/nano) [fileName]```
```[emacs](/man/emacs) [fileName]```
```[pico](/man/pico) [fileName]```
```[ed](/man/ed) [fileName]```

## Copy file or folder
```[cp](/man/cp) [fileName] [newFileName]```
```[cat](/man/cat) [fileName] > [newFileName]```
```[dd](/man/dd) if=[fileName] of=[newFileName]```

## Move/Rename file or folder
```[mv](/man/mv) [fileName] [newFileName]```

## Create folder
```[mkdir](/man/mkdir) [folderName]```

## Delete folder
```[rm](/man/rm) -r [folderName]```

## List folder contents
```[ls](/man/ls)```
```[dir](/man/dir)```

## Change folder
```[cd](/man/cd) [path]```

## Change to users home directory
```[cd](/man/cd) ~```

## Change to parent directory
```[cd](/man/cd) ..```

## Change to previous directory
```[cd](/man/cd) -```

## Show current folder
```[pwd](/man/pwd)```

## Create a physical link to file or folder
```[ln](/man/ln) [fileOrigin] [linkDest]```

## Find phrase within file
```[grep](/man/grep) [phrase] [fileName]```

## Get filesystem of partition
```[file](/man/file) -sL [partition]```

## Mount filesystem
```[mount](/man/mount) /dev/[device] [path]```

## Unmount filesystem
```[umount](/man/umount) [path]```

## Make file executable
```[chmod](/man/chmod) +x [file]```

## Show size of all sub directories
```[du](/man/du) -h --max-depth=1```

## Display and update information of files
```[watch](/man/watch) -d -n 2 'df; ls -FlAt;'```

## List trash files
```[ls](/man/ls) -l ~/.local/share/Trash/files```
```[trash-list](/man/trash-list)```

## Empty trash
```[rm](/man/rm) -r ~/.local/share/Trash```
```[gio](/man/gio) trash --empty```
```[gvfs-trash](/man/gvfs-trash) --empty```
```[trash-empty](/man/trash-empty)```

## Move file to trash
```[gio](/man/gio) trash [file]```

## View file permission
```[ls](/man/ls) -l [file]```

## Set file permission
```[chmod](/man/chmod) [permission] [file]```

## View owner and group of file
```[ls](/man/ls) -l [file]```

## Change owner of file
```[chown](/man/chown) [user] [file]```

## Change group ownership of file
```[chgrp](/man/chgrp) [group] [file]```
