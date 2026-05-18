# Maintainer: Simon Schubert <sschubert89@gmail.com>
# https://github.com/SimonSchubert/LinuxCommandLibrary

pkgname=lcl-bin
pkgver=4.0.4
pkgrel=1
pkgdesc='Linux command reference and cheat sheets for your terminal'
arch=('x86_64')
url='https://github.com/SimonSchubert/LinuxCommandLibrary'
license=('Apache-2.0')
depends=(
  'glibc'
  'libgcc'
  'libxcrypt-compat'
)
provides=('lcl')
conflicts=('lcl')

source=("LinuxCommandLibrary-${pkgver}-cli-linux-x64.zip::https://github.com/SimonSchubert/LinuxCommandLibrary/releases/download/v${pkgver}/LinuxCommandLibrary-${pkgver}-cli-linux-x64.zip")
sha256sums=('febd2d1cf3ef9e57ada1fc4c82cbbe654363ba77e930a06c255b5bd882088c3a')

package() {
    install -Dm755 "${srcdir}/lcl" "${pkgdir}/usr/bin/lcl"
}
