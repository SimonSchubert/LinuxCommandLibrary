# Input

## Getting Started
Which tool works depends on your display server: **xclip**, **xsel**, and **xdotool** are for X11, while **wl-copy**, **wtype** are for Wayland. **ydotool** works on both because it injects events at the kernel level (it needs the **ydotoold** daemon running and root or uinput access).
```[echo](/man/echo) $XDG_SESSION_TYPE```

## Clipboard on X11
Copy a file or command output to the clipboard, and paste it back out.
```[xclip](/man/xclip) -sel clip [file]```
```[uname](/man/uname) -a | [xclip](/man/xclip) -sel clip```
```[xclip](/man/xclip) -o -sel clip```

**xsel** does the same job with slightly different flags.
```[xsel](/man/xsel) -b < [file]```
```[xsel](/man/xsel) -b```

X11 has two clipboards: the regular one (**-sel clip**, pasted with Ctrl+V) and the primary selection (pasted with the middle mouse button).

## Clipboard on Wayland
```[wl-copy](/man/wl-copy) "Hello world"```
```[uname](/man/uname) -a | [wl-copy](/man/wl-copy)```
```[wl-paste](/man/wl-paste)```

## Moving the Mouse
Move to an absolute screen position, or relative to the current position.
```[xdotool](/man/xdotool) mousemove [x] [y]```
```[xdotool](/man/xdotool) mousemove_relative [x] [y]```
```[ydotool](/man/ydotool) mousemove --absolute [x] [y]```
```[ydotool](/man/ydotool) mousemove [x] [y]```

## Clicking
**xdotool** numbers buttons 1 (left), 2 (middle), 3 (right). **ydotool** uses button codes: **0xC0** left, **0xC1** right, **0xC2** middle.
```[xdotool](/man/xdotool) click 1```
```[xdotool](/man/xdotool) click 3```
```[ydotool](/man/ydotool) click 0xC0```
```[ydotool](/man/ydotool) click 0xC1```

## Typing Text
```[xdotool](/man/xdotool) type "Hello world"```
```[ydotool](/man/ydotool) type "Hello world"```
```[wtype](/man/wtype) "Hello world"```

## Pressing Keys
**xdotool** and **wtype** accept key names. **ydotool** uses Linux keycodes with **:1** for press and **:0** for release, so Escape (keycode 1) is **1:1 1:0**.
```[xdotool](/man/xdotool) key Escape```
```[xdotool](/man/xdotool) key ctrl+shift+t```
```[wtype](/man/wtype) -k Escape```
```[ydotool](/man/ydotool) key 1:1 1:0```

Find keycodes for ydotool in /usr/include/linux/input-event-codes.h, for example KEY_ENTER is 28 and KEY_LEFTALT is 56.
