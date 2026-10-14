# Maintainer: Simon Schubert <sschubert89@gmail.com>
# https://github.com/SimonSchubert/LinuxCommandLibrary

pkgname=lcl-bin
pkgver=4.9.1
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
sha256sums=('0f9b87155e84c150cd927396f2c8cf12bcdfaaa1c55f56c66c12784b9cdcf9d9')

package() {
    install -Dm755 "${srcdir}/lcl" "${pkgdir}/usr/bin/lcl"
}
