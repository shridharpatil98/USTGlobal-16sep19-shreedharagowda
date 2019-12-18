import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'bookFilter'
})
export class BookFilterPipe implements PipeTransform {

  transform(books: any[], search: string): any {
    if (!books) {
      return null;
    }
    if (!search) {
      return books;
    }
    return books.filter(function (item) {
      return JSON.stringify(item).toLowerCase().includes(search.toLowerCase());
    });
  }
}
