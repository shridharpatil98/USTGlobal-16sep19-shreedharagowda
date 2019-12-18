import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'studentFilter'
})
export class StudentFilterPipe implements PipeTransform {

  transform(student: any[], search: string): any {
    if (!student) {
      return null;
    }
    if (!search) {
      return student;
    }
    return student.filter( function(item) {
      return JSON.stringify(item).toLowerCase().includes(search.toLowerCase());
    });
  }
}
