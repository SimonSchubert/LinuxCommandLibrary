# Input

## Copy to clipboard
```[xclip](/man/xclip) -sel clip [file]```
```[uname](/man/uname) -a | [xclip](/man/xclip) -sel clip```

## Read clipboard
```[xclip](/man/xclip) -o -sel clip```

## Move mouse absolute
```[xdotool](/man/xdotool) mousemove [x] [y]```
```[ydotool](/man/ydotool) mousemove --absolute [x] [y]```

## Move mouse relative
```[xdotool](/man/xdotool) mousemove_relative [x] [y]```
```[ydotool](/man/ydotool) mousemove [x] [y]```

## Click mouse
```[xdotool](/man/xdotool) click 1```
```[ydotool](/man/ydotool) click left```

## Type text
```[xdotool](/man/xdotool) type "Hello world"```
```[ydotool](/man/ydotool) type "Hello world"```
```[wtype](/man/wtype) "Hello world"```

## Type keystroke
```[xdotool](/man/xdotool) key Escape```
```[ydotool](/man/ydotool) key Escape```
```[wtype](/man/wtype) -k Escape```
