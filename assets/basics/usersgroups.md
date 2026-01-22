# Users & Groups

## Print a file
```[cat](/man/cat) [file] > /dev/lp```
```[cat](/man/cat) [file] | [lpr](/man/lpr)```
```[pr](/man/pr) -l60 [file] | [lpr](/man/lpr)```
```[lpr](/man/lpr) [printerName] [file]```

## View printing queue
```[lpq](/man/lpq)```

## Cancel printing job
```[lprm](/man/lprm) -```
```[lprm](/man/lprm) [jobID]```
```[lprm](/man/lprm) -a all```
```[cancel](/man/cancel) [printerName]```
```[cancel](/man/cancel) -u [user]```

## Display printer status
```[lpstat](/man/lpstat) -t```

## Enable printer
```[enable](/man/enable) [name]```

## Disable printer
```[disable](/man/disable) [name]```
